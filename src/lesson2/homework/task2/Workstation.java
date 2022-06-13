package lesson2.homework.task2;

public class Workstation extends Laptop {
    private Dockstation dockstation;

    public Workstation() {
    }

    public Workstation(String cpu, int ram, String monitor, boolean touchpad, Dockstation dockstation) {
        super(cpu, ram, monitor, touchpad);
        this.dockstation = dockstation;
    }

    public Dockstation getDockstation() {
        return dockstation;
    }

    public void setDockstation(Dockstation dockstation) {
        this.dockstation = dockstation;
    }

    @Override
    public String toString() {
        return "Workstation{" + "dockstation=" + dockstation + "} " + super.toString();
    }

    public void start() {
        this.dockstation.start();
    }
}
