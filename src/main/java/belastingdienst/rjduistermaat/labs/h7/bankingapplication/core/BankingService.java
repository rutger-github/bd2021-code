package belastingdienst.rjduistermaat.labs.h7.bankingapplication.core;

import java.math.BigDecimal;

public class BankingService {
    public void transfer(BankAccount fromBankAccount, BankAccount toBankAccount, BigDecimal amountToTransfer) {
        if (fromBankAccount.getBalance().compareTo(amountToTransfer) <= 0) {
            System.exit(1);
        }

        fromBankAccount.withdraw(amountToTransfer);
        toBankAccount.deposit(amountToTransfer);

    }

    public void withdraw(BankAccount fromBankAccount, BigDecimal amountToWithdraw) {
        if (fromBankAccount.getBalance().compareTo(amountToWithdraw) <= 0) {
            System.exit(1);
        }

        fromBankAccount.withdraw(amountToWithdraw);

    }

    public void deposit(BankAccount toBankAccount, BigDecimal amountToDeposit) {

        toBankAccount.deposit(amountToDeposit);
    }

}
