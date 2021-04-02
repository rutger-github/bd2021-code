package belastingdienst.rjduistermaat.labs.tdd1.payment.core.card;

public class RegularCard extends Card {

    public RegularCard(int cardId, String name, Double credit) {
        super(cardId, name, credit);
    }

    @Override
    public boolean pay(int amount) {
        if (this.credit - amount < 0) {
            return false;
        }

        this.credit -= amount;
        return true;
    }
}
