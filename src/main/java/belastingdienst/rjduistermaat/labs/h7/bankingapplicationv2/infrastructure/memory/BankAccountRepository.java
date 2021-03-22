package belastingdienst.rjduistermaat.labs.h7.bankingapplicationv2.infrastructure.memory;

import belastingdienst.rjduistermaat.labs.h7.bankingapplicationv2.core.BankAccountRepositoryInterface;
import belastingdienst.rjduistermaat.labs.h7.bankingapplicationv2.core.exceptions.UnknownBankAccountNumberException;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class BankAccountRepository implements BankAccountRepositoryInterface {
    private Map<String, Map> bankAccounts;


    public BankAccountRepository() {
        this.bankAccounts = new HashMap<>();
    }

    @Override
    public void transfer(String fromBankAccountNumber, String toBankAccountNumber, BigDecimal amountToTransfer) {
        var fromBankAccount = this.getMapBankAccount(fromBankAccountNumber);
        var toBankAccount = this.getMapBankAccount(toBankAccountNumber);

        BigDecimal fromBankAccountBalance = (BigDecimal) fromBankAccount.get("balance");
        BigDecimal toBankAccountBalance = (BigDecimal) toBankAccount.get("balance");

        fromBankAccount.put("balance", fromBankAccountBalance.subtract(amountToTransfer));
        toBankAccount.put("balance", toBankAccountBalance.add(amountToTransfer));
        this.bankAccounts.put(fromBankAccountNumber, fromBankAccount);
        this.bankAccounts.put(toBankAccountNumber, toBankAccount);
    }

    @Override
    public void withdraw(String bankAccountNumber, BigDecimal amountToWithdraw) {

        var bankAccount = this.getMapBankAccount(bankAccountNumber);
        BigDecimal bankAccountBalance = (BigDecimal) bankAccount.get("balance");
        bankAccount.put("balance", bankAccountBalance.subtract(amountToWithdraw));

        this.bankAccounts.put(bankAccountNumber, bankAccount);

    }

    @Override
    public void deposit(String bankAccountNumber, BigDecimal amountToDeposit) {

        var bankAccount = this.getMapBankAccount(bankAccountNumber);

        BigDecimal bankAccountBalance = (BigDecimal) bankAccount.get("balance");
        bankAccount.put("balance", bankAccountBalance.add(amountToDeposit));

        this.bankAccounts.put(bankAccountNumber, bankAccount);
    }

    @Override
    public BigDecimal getBalance(String bankAccountNumber) {
        return (BigDecimal) this.getMapBankAccount(bankAccountNumber).get("balance");
    }

    public void createAccount(String accountNumber, BigDecimal balance, BigDecimal interestRate) {
        Map innerMap = new HashMap<>();
        innerMap.put("accountNumber", accountNumber);
        innerMap.put("balance", balance);
        innerMap.put("interestRate", interestRate);

        this.bankAccounts.put(accountNumber, innerMap);
    }

    private Map getMapBankAccount(String bankAccountNumber) {
        if (this.bankAccounts.containsKey(bankAccountNumber) == false) {
            throw new UnknownBankAccountNumberException();
        }
        return this.bankAccounts.get(bankAccountNumber);
    }
}
