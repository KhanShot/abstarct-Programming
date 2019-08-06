public class DisplayCurrentCurrency implements IDisplay, IObserver{
    private double DollarToTenge;
    private ISubject subject;
    public DisplayCurrentCurrency(ISubject iSubject){
        this.subject = subject;
        iSubject.createObservers(this);
    }
    @Override
    public void display() {
        System.out.println("Currrent value: "  + DollarToTenge);
    }
    @Override
    public void update(double DollarToTenge) {
        this.DollarToTenge = DollarToTenge;
        display();
    }
}