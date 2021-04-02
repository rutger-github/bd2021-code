package belastingdienst.rjduistermaat.labs.tdd1.payment.core.card;

public abstract class Card {
    protected final int cardId;
    protected String name;
    protected Double credit;

    public Card(int cardId, String name, Double credit) {
        this.cardId = cardId;
        this.name = name;
        this.credit = credit;
    }

    public abstract boolean pay(int amount);

    @Override
    public String toString() {
        return "cardId=" + cardId +
                ", name='" + name + '\'' +
                ", credit=" + credit;
    }
}
