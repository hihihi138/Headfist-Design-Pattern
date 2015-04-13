/**
 * Created by jqliu on 3/30/2015.
 */
public class ModelDuck extends Duck {
    public ModelDuck() {
        flybehavior = new FlyNoWay();
        quackbehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck.");
    }
}
