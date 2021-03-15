package belastingdienst.rjduistermaat.labs.h7.bankingapplication.core;

import java.math.BigDecimal;

public class BankAccount {
    private final String accountNumber;
    private BigDecimal balance;
    private InterestRate interestRate;

    public BankAccount(String accountNumber, InterestRate interestRate) {
        this.accountNumber = accountNumber;
        this.interestRate = interestRate;
        this.balance = BigDecimal.valueOf(0L);
    }

    public void withdraw(BigDecimal amountToWithdraw) {
        this.balance = this.balance.subtract(amountToWithdraw);
    }

    public void deposit(BigDecimal amountToDeposit) {
        this.balance = this.balance.add(amountToDeposit);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public InterestRate getInterestRate() {
        return interestRate;
    }
}
