package belastingdienst.rjduistermaat.labs.tdd1.payment.infrastructure.container;

import belastingdienst.rjduistermaat.labs.tdd1.payment.core.PayService;
import belastingdienst.rjduistermaat.labs.tdd1.shared.core.container.Container;
import belastingdienst.rjduistermaat.labs.tdd1.shared.core.container.ServiceProviderInterface;

public class ServiceProviderPayment implements ServiceProviderInterface {
    @Override
    public void register(Container container) {
        container.putContainerObject(PayService.class.getName(), () -> {
            return new PayService();
        });
    }
}
