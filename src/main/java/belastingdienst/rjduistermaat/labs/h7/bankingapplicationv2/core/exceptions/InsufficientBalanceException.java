package belastingdienst.rjduistermaat.labs.h7.bankingapplicationv2.core.exceptions;

public class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException() {
        super("Insufficient balance on bank account");
    }
}
