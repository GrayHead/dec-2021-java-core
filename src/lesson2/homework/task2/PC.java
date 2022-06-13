package lesson2.homework.task2;

public class PC {
    private String cpu;
    private int ram;
    private String monitor;

    public PC() {
    }

    public PC(String cpu, int ram, String monitor) {
        this.cpu = cpu;
        this.ram = ram;
        this.monitor = monitor;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    @Override
    public String toString() {
        return "PC{" + "cpu='" + cpu + '\'' + ", ram=" + ram + ", monitor='" + monitor + '\'' + '}';
    }
}
