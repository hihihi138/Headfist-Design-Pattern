/**
 * Created by jqliu on 3/30/2015.
 */
public abstract class Duck {
    FlyBehavior flybehavior;
    QuackBehavior quackbehavior;

    public void swim(){
        System.out.println("I can swim.");
    };

    public abstract void display();

    public void performFly() {
        flybehavior.fly();
    }

    public void performQuack(){
        quackbehavior.quack();
    }

    public void setFlybehavior(FlyBehavior fb){
        flybehavior = fb;
    }

    public void setQuackbehavior(QuackBehavior qb){
        quackbehavior = qb;
    }

    // OTHER duck-like methods...

}
