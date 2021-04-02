package belastingdienst.rjduistermaat.labs.tdd1;

import belastingdienst.rjduistermaat.labs.tdd1.payment.core.OverviewService;
import belastingdienst.rjduistermaat.labs.tdd1.payment.core.PayService;
import belastingdienst.rjduistermaat.labs.tdd1.payment.core.card.Card;
import belastingdienst.rjduistermaat.labs.tdd1.payment.core.card.GoldCard;
import belastingdienst.rjduistermaat.labs.tdd1.payment.core.card.RegularCard;
import belastingdienst.rjduistermaat.labs.tdd1.payment.core.command.PayCommand;
import belastingdienst.rjduistermaat.labs.tdd1.shared.core.container.Container;

import java.util.HashSet;

public class App {

    public static void main(String[] args) {
        var container = Container.getInstance();
        var payService = container.getContainerObject(PayService.class);
        var overviewService = container.getContainerObject(OverviewService.class);

        var gerda = new RegularCard(1235, "Gerda", 1000.0);
        var donald = new GoldCard(1236, "Donald", 1000.0, 20);

        var collection = new HashSet<Card>();
        collection.add(gerda);
        collection.add(donald);

        overviewService.output(collection);

        payService.pay(new PayCommand(gerda, 100));
        payService.pay(new PayCommand(donald, 100));

        overviewService.output(collection);


    }


}
