package belastingdienst.rjduistermaat.labs.tdd1.payment.core.card;

public class GoldCard extends Card {
    private int discount;

    public GoldCard(int cardId, String name, Double credit) {
        super(cardId, name, credit);
    }

    @Override
    public boolean pay(int amount) {
        var amounAfterDiscount = amount - (amount * discount / 100);
        this.credit -= amounAfterDiscount;
        return true;
    }

    public void setDiscount(int discount) {
        if (discount < 1 || discount > 30) {
            throw new RuntimeException("out of range");
        }
        this.discount = discount;
    }
}
