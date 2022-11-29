public class BaseBurger {
    private int breadRollType;
    private int meatType;
    private String name;
    private double price;
    private int additions;

    public BaseBurger(int breadRollType, int meatType) {
        this.breadRollType = breadRollType;
        this.meatType = meatType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
