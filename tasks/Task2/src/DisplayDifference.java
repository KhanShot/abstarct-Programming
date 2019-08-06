public class DisplayDifference implements IDisplay, IObserver {
    private double DollarToTenge;
    private double AnotherTenge;
    private Currency currency;
    public DisplayDifference(Currency currency){
        this.currency = currency;
        AnotherTenge = this.currency.getDollarToTenge();
        currency.createObservers(this);
    }

    @Override
    public void display() {
        System.out.println("The Difference Value is: " + (AnotherTenge- DollarToTenge));
    }

    @Override
    public void update(double DollarToTenge) {
        AnotherTenge = DollarToTenge;
        display();
    }
}
