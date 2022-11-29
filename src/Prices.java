public class Prices {
    private double baseBurgerPrice;
    private double healthyBurgerPrice;
    private double deluxeBurgerPrice;

    public Prices() {
        this(7.45,9.99,8.85);
    }

    public Prices(double baseBurgerPrice, double healthyBurgerPrice, double deluxeBurgerPrice) {
        this.baseBurgerPrice = baseBurgerPrice;
        this.healthyBurgerPrice = healthyBurgerPrice;
        this.deluxeBurgerPrice = deluxeBurgerPrice;
    }

    public double getBaseBurgerPrice() {
        return baseBurgerPrice;
    }

    public double getHealthyBurgerPrice() {
        return healthyBurgerPrice;
    }

    public double getDeluxeBurgerPrice() {
        return deluxeBurgerPrice;
    }
}
