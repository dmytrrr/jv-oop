package core.basesyntax;

public class MainApp {

    Machine[] machines = new Machine[]{new Excavator(), new Truck(), new Bulldozer() };

    public void startProcess() {
        for (Machine machine : machines) {
          machine.doWork();
          machine.stopWork();
        }
    }
}
