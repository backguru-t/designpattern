public class MallrdDuck extends Duck {

    public MallrdDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("I am a real Mallard duck!");
    }
}
