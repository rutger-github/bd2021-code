package belastingdienst.rjduistermaat.helloworld.infrastructure.cli;

import belastingdienst.rjduistermaat.helloworld.core.OutputInterface;

public class SystemOutPrintln implements OutputInterface {
    @Override
    public void output(String output) {
        System.out.println(output);
    }
}
