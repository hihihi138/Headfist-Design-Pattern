package decoratorpattern;

/**
 * Created by jqliu on 4/20/2015.
 */
public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso";
    }

    public double cost() {
        return 1.99;
    }
}
