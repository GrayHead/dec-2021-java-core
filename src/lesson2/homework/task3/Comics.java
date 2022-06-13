package lesson2.homework.task3;


public class Comics extends Book {
    private String universe;

    public Comics() {
    }

    public Comics(int pages, String title, String universe) {
        super(pages, title);
        this.universe = universe;
    }

    public String getUniverse() {
        return universe;
    }

    public void setUniverse(String universe) {
        this.universe = universe;
    }

    @Override
    public String toString() {
        return "Comics{" + "universe='" + universe + '\'' + "} " + super.toString();
    }
}
