public class Main {
    public static void main(String[] args) {
        Burger burger = new Burger("Basic", "Sausage", 3.56, "White");
        double price = burger.itemizeBurger();
        burger.addBurgerAddition1("Tomato",0.75);
        burger.addBurgerAddition2("Lettuce",0.30);
        burger.addBurgerAddition3("Cheese",1.12);
        System.out.println("Total Burger price is " + burger.itemizeBurger());
    }
}
