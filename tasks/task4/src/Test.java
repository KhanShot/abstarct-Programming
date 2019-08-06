public class Test {
    public static void main(String[] args) {
        Factory factory=new Factory();
        Os windows=factory.creatOs();
        windows.display();
    }
}
