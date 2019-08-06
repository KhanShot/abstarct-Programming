public class Test {
    public static void main(String[] args) throws InterruptedException {
        Currency currency = new Currency(364.4);
        DisplayDifference dd = new DisplayDifference(currency);
        DisplayCurrentCurrency dcc = new DisplayCurrentCurrency(currency);
        while (true){
            Thread.sleep(2000);
            currency.changeValue(Math.random()*1-Math.random()*1);
        }
    }
}
