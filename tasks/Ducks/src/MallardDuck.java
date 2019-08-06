public class MallardDuck extends Duck {
    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();
        duck.setFlyBehavior(new FlyWithWings());
        duck.setQuackBehavior(new Squack());
        duck.performQuack();
        duck.performFly();
        display();
    }
    private static void display(){
        System.out.println("I'm a MallardDuck!");
    }
}