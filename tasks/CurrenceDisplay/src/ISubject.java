public interface ISubject {
    public int registerObserver();
    public int removeObserver();
    public void notifyObserver();
}
