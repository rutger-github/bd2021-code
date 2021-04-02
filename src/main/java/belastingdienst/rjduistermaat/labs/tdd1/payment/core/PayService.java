package belastingdienst.rjduistermaat.labs.tdd1.payment.core;

import belastingdienst.rjduistermaat.labs.tdd1.payment.core.command.PayCommand;

public class PayService {

    public boolean pay(PayCommand command) {
        return command.getCard().pay(command.getAmount());
    }
}
