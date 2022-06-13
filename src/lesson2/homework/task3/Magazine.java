package lesson2.homework.task3;


public class Magazine extends Book {
    private int price;


    public Magazine() {
    }

    public Magazine(int pages, String title, int price) {
        super(pages, title);
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Magazine{" + "price=" + price + "} " + super.toString();
    }
}
