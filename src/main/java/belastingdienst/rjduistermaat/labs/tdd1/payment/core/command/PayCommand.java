package belastingdienst.rjduistermaat.labs.tdd1.payment.core.command;

import belastingdienst.rjduistermaat.labs.tdd1.payment.core.card.Card;

public class PayCommand {
    private Card card;
    private int amount;

    public PayCommand(Card card, int amount) {
        this.card = card;
        this.amount = amount;
    }

    public Card getCard() {
        return card;
    }

    public int getAmount() {
        return amount;
    }
}
