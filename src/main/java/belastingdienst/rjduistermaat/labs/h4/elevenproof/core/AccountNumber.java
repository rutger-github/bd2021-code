package belastingdienst.rjduistermaat.labs.h4.elevenproof.core;

public class AccountNumber {
    private String accountNumber;
    private static int validLength = 9;

    private AccountNumber(String accountNumber) {
        String removedDotsAccountNumber = accountNumber.replace(".", "");

        if (this.checkValidNumericInput(removedDotsAccountNumber) == false) {
            throw new RuntimeException();
        }

        if (this.checkValidElevenProof(removedDotsAccountNumber) == false) {
            throw new RuntimeException(removedDotsAccountNumber);
        }


        this.accountNumber = removedDotsAccountNumber;
    }

    public static AccountNumber fromString(String accountNumber) {
        return new AccountNumber(accountNumber);
    }

    private boolean checkValidNumericInput(String accountNumber) {
        return (accountNumber.matches("[0-9]+") && accountNumber.length() == validLength);
    }

    private boolean checkValidElevenProof(String accountNumber) {

        var charArray = accountNumber.toCharArray();

        int sum = 0;
        for (int i = 9; i > 0; i--) {

            var stringValue = String.valueOf(charArray[validLength - i]);

            sum += i * Integer.parseInt(stringValue);
        }

        return (sum % 11 == 0);
    }
}
