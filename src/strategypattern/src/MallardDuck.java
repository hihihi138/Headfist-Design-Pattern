/**
 * Created by jqliu on 3/30/2015.
 */
public class MallardDuck extends Duck {
    public MallardDuck() {
        flybehavior = new FlyWithWings();
        quackbehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a mallard duck.");
    }
}
