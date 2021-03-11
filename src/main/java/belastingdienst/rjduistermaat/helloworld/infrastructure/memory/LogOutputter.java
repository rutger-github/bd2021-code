package belastingdienst.rjduistermaat.helloworld.infrastructure.memory;

import belastingdienst.rjduistermaat.helloworld.core.OutputInterface;

public class LogOutputter implements OutputInterface {
    private String output;

    @Override
    public void output(String output) {
        this.output = output;
    }

    public String getOutput() {
        return output;
    }
}
