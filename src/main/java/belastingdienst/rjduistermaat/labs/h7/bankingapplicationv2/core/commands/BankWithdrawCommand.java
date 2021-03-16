package belastingdienst.rjduistermaat.labs.h7.bankingapplicationv2.core.commands;

import java.math.BigDecimal;

public class BankWithdrawCommand {
    private final String bankAccountNumber;
    private final BigDecimal amountToWithdraw;

    public BankWithdrawCommand(String bankAccountNumber, BigDecimal amountToWithdraw) {
        this.bankAccountNumber = bankAccountNumber;
        this.amountToWithdraw = amountToWithdraw;
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public BigDecimal getAmountToWithdraw() {
        return amountToWithdraw;
    }
}
