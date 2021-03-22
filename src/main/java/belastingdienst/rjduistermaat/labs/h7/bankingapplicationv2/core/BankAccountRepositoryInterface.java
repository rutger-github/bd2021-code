package belastingdienst.rjduistermaat.labs.h7.bankingapplicationv2.core;

import java.math.BigDecimal;

public interface BankAccountRepositoryInterface {
    void transfer(String fromBankAccountNumber, String toBankAccountNumber, BigDecimal amountToTransfer);

    void withdraw(String bankAccountNumber, BigDecimal amountToWithdraw);

    void deposit(String bankAccountNumber, BigDecimal amountToDeposit);

    BigDecimal getBalance(String bankAccountNumber);

    void createAccount(String accountNumber, BigDecimal balance, BigDecimal interestRate);
}
