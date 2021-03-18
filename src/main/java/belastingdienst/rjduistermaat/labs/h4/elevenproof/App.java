package belastingdienst.rjduistermaat.labs.h4.elevenproof;

import belastingdienst.rjduistermaat.labs.h4.elevenproof.core.AccountNumber;
import belastingdienst.rjduistermaat.labs.h4.elevenproof.core.InvalidAccountNumberException;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter an account number");
        String enteredAccountNumber = in.nextLine();


        try {
            AccountNumber accountNumber1 = AccountNumber.fromString(enteredAccountNumber);
            System.out.println("Account number " + accountNumber1.getAccountNumber() + " is valid.");
        } catch (InvalidAccountNumberException e) {
            System.out.println(e.getMessage());
        }
    }
}
