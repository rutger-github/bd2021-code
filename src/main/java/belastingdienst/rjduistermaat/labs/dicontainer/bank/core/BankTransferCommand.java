package belastingdienst.rjduistermaat.labs.dicontainer.bank.core;

import belastingdienst.rjduistermaat.labs.h7.bankingapplicationv2.core.exceptions.InvalidAmountToTransferException;

import java.math.BigDecimal;

public class BankTransferCommand {
    private final String fromBankAccountNumber;
    private final String toBankAccountNumber;
    private final BigDecimal amountToTransfer;

    public BankTransferCommand(String fromBankAccountNumber, String toBankAccountNumber, BigDecimal amountToTransfer) throws InvalidAmountToTransferException {
        this.fromBankAccountNumber = fromBankAccountNumber;
        this.toBankAccountNumber = toBankAccountNumber;

        if (amountToTransfer.compareTo(BigDecimal.ZERO) != 1) {
            throw new InvalidAmountToTransferException();
        }
        this.amountToTransfer = amountToTransfer;
    }

    public String getFromBankAccountNumber() {
        return fromBankAccountNumber;
    }

    public String getToBankAccountNumber() {
        return toBankAccountNumber;
    }

    public BigDecimal getAmountToTransfer() {
        return amountToTransfer;
    }
}
