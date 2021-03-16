package belastingdienst.rjduistermaat.labs.h7.bankingapplicationv2.core.bankaccount;

public class AccountNumber {
    private final String accountNumber;

    private AccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public static AccountNumber fromString(String bankAccountNumber) {
        return new AccountNumber(bankAccountNumber);
    }
}
