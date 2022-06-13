package lesson2.homework.task3;


public class Papyrus {
    private int pages;

    public Papyrus() {
    }

    public Papyrus(int pages) {
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Papyrus{" +
                "pages=" + pages +
                '}';
    }
}
