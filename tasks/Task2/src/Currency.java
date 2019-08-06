import java.util.ArrayList;

public class Currency implements ISubject{
    private ArrayList<IObserver> observers = new ArrayList<IObserver>();
    private double DollarToTenge;
    private double AnotherTenge;
    public double getDollarToTenge(){
        return DollarToTenge;
    }
    public Currency(double DollarToTenge){
        this.DollarToTenge = DollarToTenge;
        AnotherTenge = DollarToTenge;

    public void createObservers(IObserver obs){
        observers.add(obs);
    }
    public void removeObservers(IObserver obs){
        int a = observers.indexOf(obs);
        if(a>=0){
            observers.remove(obs);
        }
    }
    public void defineObservers(){
        for (int i = 0; i < observers.size(); i++) {
            IObserver observer = observers.get(i);
            observer.update(AnotherTenge);
        }
    }
    private void valueChanged(){
        if((AnotherTenge - DollarToTenge)>=2 || (AnotherTenge - DollarToTenge)<= -2)
            defineObservers();
    }
    public void changeValue(double DollarToTenge){
        this.AnotherTenge = this.AnotherTenge + DollarToTenge;
        valueChanged();
    }

}
