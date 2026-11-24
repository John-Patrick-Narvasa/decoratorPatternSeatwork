package decoratorPatternSeatwork;

public class BrewtifulApp {

    public static void main(String[] args) {
        // Order 1: Plain Black Coffee
        Coffee order1 = new BlackCoffee();
        printOrder(1, order1);

        // Order 2: Black Coffee + Milk + Caramel Syrup
        Coffee order2 = new CaramelSyrup(new Milk(new BlackCoffee()));
        printOrder(2, order2);

        // Order 3: Espresso + Milk + Caramel Syrup + Whipped Cream + Sugar
        Coffee order3 = new Sugar(new WhippedCream(new CaramelSyrup(new Milk(new Espresso()))));
        printOrder(3, order3);
    }

    private static void printOrder(int orderNum, Coffee coffee) {
        System.out.println("Order #" + orderNum);
        System.out.println("Ingredients : " + coffee.getDescription());
        System.out.printf("Total Cost  : ₱ %.2f%n", coffee.getCost());
        System.out.println("----------------------------------------");
    }
}