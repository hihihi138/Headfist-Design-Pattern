/**
 * Created by jqliu on 3/30/2015.
 */
public class DecoyDuck extends Duck {
    public DecoyDuck() {
        flybehavior = new FlyNoWay();
        quackbehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("I'm a decoy duck.");
    }
}
