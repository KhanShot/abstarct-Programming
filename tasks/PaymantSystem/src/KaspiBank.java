import java.util.Scanner;

public class KaspiBank implements JustPay {
    @Override
    public void pay() {
        String a = "";
        while (!a.equals("1408")){
            System.out.println("enter code");
            Scanner scanner = new Scanner(System.in);
            a = scanner.next();
            if(a.equals("1408")){
                System.out.println("entered");
                break;
            }
        }
    }
}
