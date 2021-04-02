package belastingdienst.rjduistermaat.labs.tdd1.payment.infrastructure.system;

import belastingdienst.rjduistermaat.labs.tdd1.payment.core.OverviewOutputterInterface;
import belastingdienst.rjduistermaat.labs.tdd1.payment.core.card.Card;
import belastingdienst.rjduistermaat.labs.tdd1.shared.infrastructure.system.SoutWrapper;

import java.util.Collection;

public class OverviewOutputter implements OverviewOutputterInterface {
    @Override
    public void output(Collection<Card> cardCollection) {
        for (Card card : cardCollection) {
            SoutWrapper.print(card);
        }
    }
}
