package belastingdienst.rjduistermaat.labs.h7.bankingapplication;

import belastingdienst.rjduistermaat.labs.h7.bankingapplication.core.BankAccount;
import belastingdienst.rjduistermaat.labs.h7.bankingapplication.core.BankingService;
import belastingdienst.rjduistermaat.labs.h7.bankingapplication.core.InterestRate;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Application {

    public static void main(String[] args) {
        InterestRate interestRate = new InterestRate(LocalDate.now(), 5.0f);

        BankAccount bankAccountRutger = new BankAccount("12345", interestRate);
        BankAccount bankAccountPiet = new BankAccount("11111", interestRate);
        BankAccount bankAccountSjaak = new BankAccount("22222", interestRate);

        BankingService bankingService = new BankingService();

        bankingService.deposit(bankAccountRutger, BigDecimal.valueOf(1000L));
        bankingService.deposit(bankAccountPiet, BigDecimal.valueOf(100L));
        bankingService.transfer(bankAccountPiet, bankAccountRutger, BigDecimal.valueOf(5.01));


        System.out.println(bankAccountPiet.getBalance());
        System.out.println(bankAccountRutger.getBalance());


    }
}
