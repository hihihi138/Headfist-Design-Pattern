/**
 * Created by jqliu on 3/30/2015.
 */
public class RubberDuck extends Duck {
    public RubberDuck() {
        flybehavior = new FlyNoWay();
        quackbehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("I'm a rubber duck.");
    }
}
