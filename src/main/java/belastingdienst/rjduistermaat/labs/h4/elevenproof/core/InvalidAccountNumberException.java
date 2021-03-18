package belastingdienst.rjduistermaat.labs.h4.elevenproof.core;

public class InvalidAccountNumberException extends IllegalArgumentException {
    public InvalidAccountNumberException() {
        super("The provided account number is not valid.");
    }
}
