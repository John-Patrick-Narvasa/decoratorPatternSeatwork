package decoratorPatternSeatwork;


public class WhippedCream implements CoffeeDecorator {
    private Coffee wrappedCoffee;

    public WhippedCream(Coffee coffee) {
        setCoffee(coffee);
    }

    @Override
    public void setCoffee(Coffee coffee) {
        this.wrappedCoffee = coffee;
    }

    @Override
    public String getDescription() {
        return wrappedCoffee.getDescription() + ", Whipped Cream";
    }

    @Override
    public double getCost() {
        return wrappedCoffee.getCost() + 30.00;
    }
}