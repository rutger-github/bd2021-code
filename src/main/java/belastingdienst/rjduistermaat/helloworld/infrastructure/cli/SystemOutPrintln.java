package belastingdienst.rjduistermaat.helloworld.infrastructure.cli;

import belastingdienst.rjduistermaat.helloworld.core.OperatorOutputInterface;

public class SystemOutPrintln implements OperatorOutputInterface {
    @Override
    public void output(String output) {
        System.out.println(output);
    }
}
