package lesson2.homework.task2;

public class Dockstation {
    private String title;
    private int ports;

    public Dockstation() {
    }

    public Dockstation(String title, int ports) {
        this.title = title;
        this.ports = ports;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPorts() {
        return ports;
    }

    public void setPorts(int ports) {
        this.ports = ports;
    }

    @Override
    public String toString() {
        return "Dockstation{" + "title='" + title + '\'' + ", ports=" + ports + '}';
    }

    public void start() {
        System.out.println("startup your komp");
    }
}
