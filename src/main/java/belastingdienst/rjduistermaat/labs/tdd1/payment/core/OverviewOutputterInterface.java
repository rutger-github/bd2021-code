package belastingdienst.rjduistermaat.labs.tdd1.payment.core;

import belastingdienst.rjduistermaat.labs.tdd1.payment.core.card.Card;

import java.util.Collection;

public interface OverviewOutputterInterface {
    void output(Collection<Card> cardCollection);
}
