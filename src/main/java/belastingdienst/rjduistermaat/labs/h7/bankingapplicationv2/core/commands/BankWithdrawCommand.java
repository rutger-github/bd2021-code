package belastingdienst.rjduistermaat.labs.h7.bankingapplicationv2.core.commands;

import belastingdienst.rjduistermaat.labs.h7.bankingapplicationv2.core.exceptions.InvalidAmountToTransferException;

import java.math.BigDecimal;

public class BankWithdrawCommand {
    private final String bankAccountNumber;
    private final BigDecimal amountToWithdraw;

    public BankWithdrawCommand(String bankAccountNumber, BigDecimal amountToWithdraw) throws InvalidAmountToTransferException {
        if (amountToWithdraw.compareTo(BigDecimal.ZERO) != 1) {
            throw new InvalidAmountToTransferException();
        }

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
