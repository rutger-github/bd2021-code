package belastingdienst.rjduistermaat.labs.h7.bankingapplication.core;

import java.time.LocalDate;

public class InterestRate {
    private LocalDate date;
    private float interestRate;

    public InterestRate(LocalDate date, float interestRate) {
        this.date = date;
        this.interestRate = interestRate;
    }
}
