package lesson2.homework.task3;


public class Book extends Papyrus {
    private String title;


    public Book() {
    }

    public Book(int pages, String title) {
        super(pages);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{" + "title='" + title + '\'' + "} " + super.toString();
    }
}
