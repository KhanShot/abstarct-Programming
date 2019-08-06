public class DisplayCurrency implements IObserver, IDisplay {
    private double Tenge;
    DisplayCurrency(double Tenge){
        this.Tenge = Tenge;
    }
    @Override
    public void display() {
        System.out.println(Tenge);
    }
    @Override
    public void update(){
    }
}
