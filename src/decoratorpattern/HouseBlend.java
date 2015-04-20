package decoratorpattern;

/**
 * Created by jqliu on 4/20/2015.
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend Coffee";
    }

    public double cost() {
        return .89;
    }
}
