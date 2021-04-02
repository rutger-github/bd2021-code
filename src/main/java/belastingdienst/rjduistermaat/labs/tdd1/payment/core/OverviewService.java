package belastingdienst.rjduistermaat.labs.tdd1.payment.core;

import belastingdienst.rjduistermaat.labs.tdd1.payment.core.card.Card;

import java.util.Collection;

public class OverviewService {

    private final OverviewOutputterInterface overviewOutputter;

    public OverviewService(OverviewOutputterInterface overviewOutputter) {
        this.overviewOutputter = overviewOutputter;
    }

    public void output(Collection<Card> cardCollection) {
        this.overviewOutputter.output(cardCollection);
    }
}
