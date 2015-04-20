package decoratorpattern;

/**
 * Created by jqliu on 4/20/2015.
 */
public class Milk extends CondimentDecorator {
    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.description + ", Milk";
    }

    @Override
    public double cost() {
        return .10 + beverage.cost();
    }
}
