package decoratorPatternSeatwork;

public class BrewtifulApp {

    public static void main(String[] args) {
        Coffee order1 = new BlackCoffee();
        printOrder(1, order1);

        Coffee order2 = new CaramelSyrup(new Milk(new BlackCoffee()));
        printOrder(2, order2);

        Coffee order3 = new Sugar(new WhippedCream(new CaramelSyrup(new Milk(new Espresso()))));
        printOrder(3, order3);
    }

    private static void printOrder(int orderNum, Coffee coffee) {
        System.out.println("Order #" + orderNum);
        System.out.println("Ingredients : " + coffee.getDescription());
        System.out.println("Total Cost  : Php " + coffee.getCost());
        System.out.println("----------------------------------------");
    }
}