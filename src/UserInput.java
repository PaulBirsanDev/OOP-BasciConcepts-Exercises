import java.util.Scanner;

public class UserInput {
    public Prices prices;
    private String questionOfChoice = "What would you like to have ?";
    private String anyAddition = "Would you like something extra on your order ?";
    private String welcomingMsg;

    public void setWelcomingMsg(String welcomingMsg) {
        this.welcomingMsg = "Hello and welcome to Bill's Burger, may I take your order ?" + "\n" + "We have for you Nr.1 : Basic Burger " + prices.getBaseBurgerPrice() + "$" +
                "\n" + "Nr.2 Healthy Burger " + prices.getHealthyBurgerPrice() + "$" + "\n" +"Nr.3 Deluxe Burger " + prices.getDeluxeBurgerPrice() + "$";
    }
    //    public int welcoming() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println(welcomingMsg);
//        boolean answer = scanner.hasNextInt();
//        if (answer) {
//            scanner.nextLine();
//
//        }
//    }

}
