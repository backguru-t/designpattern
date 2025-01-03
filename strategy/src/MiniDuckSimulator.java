public class MiniDuckSimulator {

    public static void main(String[] args) {
        MallrdDuck mallrdDuck = new MallrdDuck();
        mallrdDuck.performFly();
        mallrdDuck.performQuack();

        Flyable cantFly = () -> System.out.println("I cannot fly");
        Quackable squak = () -> System.out.println("squack");

        mallrdDuck.setFlyBehavior(cantFly);
        mallrdDuck.setQuackBehavior(squak);

        mallrdDuck.performFly();
        mallrdDuck.performQuack();
    }
}
