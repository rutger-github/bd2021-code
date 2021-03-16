package belastingdienst.rjduistermaat.labs.h7.bankingapplicationv2.core.commands;

import java.math.BigDecimal;

public class BankDepositCommand {
    private final String bankAccountNumber;
    private final BigDecimal amountToDeposit;

    public BankDepositCommand(String bankAccountNumber, BigDecimal amountToDeposit) {
        this.bankAccountNumber = bankAccountNumber;
        this.amountToDeposit = amountToDeposit;
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public BigDecimal getAmountToDeposit() {
        return amountToDeposit;
    }
}
