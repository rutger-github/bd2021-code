package belastingdienst.rjduistermaat.labs.tdd1.payment.core;

import belastingdienst.rjduistermaat.labs.tdd1.payment.core.card.Card;

public class PayService {

    public boolean pay(Card card, int amount) {
        return card.pay(amount);
    }
}
