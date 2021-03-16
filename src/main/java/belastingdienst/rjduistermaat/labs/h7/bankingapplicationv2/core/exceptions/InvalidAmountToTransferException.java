package belastingdienst.rjduistermaat.labs.h7.bankingapplicationv2.core.exceptions;

public class InvalidAmountToTransferException extends Exception {
    public InvalidAmountToTransferException() {
        super("This amount is not allowed");
    }
}
