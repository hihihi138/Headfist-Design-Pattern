package decoratorpattern;

/**
 * Created by jqliu on 4/20/2015.
 */
public class Decaf extends Beverage {
    public Decaf() {
        description = "Decaf Coffee";
    }

    public double cost() {
        return 1.05;
    }
}
