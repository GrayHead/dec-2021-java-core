package lesson2.homework.task2;

public class Ultrabook extends Laptop {

    private boolean touchscreen;


    public Ultrabook() {
    }

    public Ultrabook(boolean touchscreen) {
        this.touchscreen = touchscreen;
    }

    public Ultrabook(String cpu, int ram, String monitor, boolean touchpad, boolean touchscreen) {
        super(cpu, ram, monitor, touchpad);
        this.touchscreen = touchscreen;
    }

    public boolean isTouchscreen() {
        return touchscreen;
    }

    public void setTouchscreen(boolean touchscreen) {
        this.touchscreen = touchscreen;

    }

    @Override
    public String toString() {
        return "Ultrabook{" + "touchscreen=" + touchscreen + "} " + super.toString();
    }
}
