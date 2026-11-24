package decoratorPatternSeatwork;

public class Sugar implements CoffeeDecorator {
    private Coffee wrappedCoffee;

    public Sugar(Coffee coffee) {
        setCoffee(coffee);
    }

    @Override
    public void setCoffee(Coffee coffee) {
        this.wrappedCoffee = coffee;
    }

    @Override
    public String getDescription() {
        return wrappedCoffee.getDescription() + ", Sugar";
    }

    @Override
    public double getCost() {
        return wrappedCoffee.getCost() + 10.00;
    }
}