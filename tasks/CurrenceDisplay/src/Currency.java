public class Currency implements ISubject {
    @Override
    public int registerObserver() {
        return 5;
    }

    @Override
    public int removeObserver() {
        return 5 + registerObserver();
    }

    @Override
    public void notifyObserver() {
        System.out.println(removeObserver());
    }
}
