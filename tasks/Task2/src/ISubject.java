public interface ISubject {
    public void createObservers(IObserver obs);
    public void removeObservers(IObserver obs);
    public void defineObservers();

}
