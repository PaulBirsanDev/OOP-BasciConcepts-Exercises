public class Main {
    public static void main(String[] args) {
        Burger burger = new Burger("Basic", "Sausage", 3.56, "White");
        double price = burger.itemizeBurger();
        burger.addBurgerAddition1("Tomato",0.75);
        burger.addBurgerAddition2("Lettuce",0.30);
        burger.addBurgerAddition3("Cheese",1.12);
        System.out.println("Total Burger price is " + burger.itemizeBurger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon",5.67);
        healthyBurger.addBurgerAddition1("Egg",1.12);
        healthyBurger.addHealthAddition1("Lentils",3.41);
        System.out.println("Total Healthy Burger price is " + healthyBurger.itemizeBurger());

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.itemizeBurger();

    }
}
