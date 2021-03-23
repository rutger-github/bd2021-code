package belastingdienst.rjduistermaat.labs.h7.bankingapplicationv2.core.exceptions;

public class UnknownBankAccountNumberException extends RuntimeException {
    public UnknownBankAccountNumberException() {
        super("This bankaccount number is unknown");
    }
}
