/**
 * Created by jqliu on 3/30/2015.
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        Duck decoy = new DecoyDuck();
        decoy.performQuack();
        decoy.performFly();
        decoy.swim();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlybehavior(new FlyWithWings());
        model.performFly();
        model.setFlybehavior(new FlyRocketPowered());
        model.performFly();
    }
}
