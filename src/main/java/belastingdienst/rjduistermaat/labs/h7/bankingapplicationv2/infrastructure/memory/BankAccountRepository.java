package belastingdienst.rjduistermaat.labs.h7.bankingapplicationv2.infrastructure.memory;

import belastingdienst.rjduistermaat.labs.h7.bankingapplicationv2.core.BankAccountRepositoryInterface;

import java.math.BigDecimal;
import java.util.Map;

public class BankAccountRepository implements BankAccountRepositoryInterface {
    private Map<String, BigDecimal> bankAccounts;

    public BankAccountRepository(Map<String, BigDecimal> bankAccounts) {
        this.bankAccounts = bankAccounts;
    }

    @Override
    public void transfer(String fromBankAccountNumber, String toBankAccountNumber, BigDecimal amountToTransfer) {
        BigDecimal fromBankAccountBalance = this.bankAccounts.get(fromBankAccountNumber);
        this.bankAccounts.put(fromBankAccountNumber, fromBankAccountBalance.subtract(amountToTransfer));
        this.bankAccounts.put(toBankAccountNumber, fromBankAccountBalance.add(amountToTransfer));
    }

    @Override
    public void withdraw(String bankAccountNumber, BigDecimal amountToWithdraw) {
        BigDecimal bankAccountBalance = this.bankAccounts.get(bankAccountNumber);
        this.bankAccounts.put(bankAccountNumber, bankAccountBalance.subtract(amountToWithdraw));
    }

    @Override
    public void deposit(String bankAccountNumber, BigDecimal amountToDeposit) {
        BigDecimal bankAccountBalance = this.bankAccounts.get(bankAccountNumber);
        this.bankAccounts.put(bankAccountNumber, bankAccountBalance.add(amountToDeposit));
    }

    @Override
    public BigDecimal getBalance(String bankAccountNumber) {
        return this.bankAccounts.get(bankAccountNumber);
    }

}
