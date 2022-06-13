package lesson2.homework.task2;

public class Laptop extends PC {
    private boolean touchpad;

    public Laptop() {
    }

    public Laptop(String cpu, int ram, String monitor, boolean touchpad) {
        super(cpu, ram, monitor);
        this.touchpad = touchpad;
    }


    public boolean isTouchpad() {
        return touchpad;
    }

    public void setTouchpad(boolean touchpad) {
        this.touchpad = touchpad;
    }

    @Override
    public String toString() {
        return "Laptop{" + "touchpad=" + touchpad + "} " + super.toString();
    }
}
