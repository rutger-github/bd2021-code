package belastingdienst.rjduistermaat.labs.h7.bankingapplicationv2.core.commands;

public class GetBalanceCommand {
    private final String bankAccountNumber;

    public GetBalanceCommand(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }
}
