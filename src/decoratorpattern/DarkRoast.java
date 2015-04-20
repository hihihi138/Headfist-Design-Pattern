package decoratorpattern;

/**
 * Created by jqliu on 4/20/2015.
 */
public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "Dark Roast";
    }

    @Override
    public double cost() {
        return .99;
    }
}
