/**
 * Created by jqliu on 3/30/2015.
 */
public class RedheadDuck extends Duck {
    public RedheadDuck() {
        flybehavior = new FlyWithWings();
        quackbehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a redhead duck.");
    }
}
