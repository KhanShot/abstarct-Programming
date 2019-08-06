import java.util.Scanner;

public class Qazkom implements JustPay{

    @Override
    public void pay() {
        String card="", pass="";
        while ((!card.equals("170107038")) || (!pass.equals("12345"))){
            System.out.print("Enter Card Number: ");
            Scanner sca = new Scanner(System.in);
            card = sca.next();
            System.out.print("Enter Password: ");
            pass = sca.next();
            if(card.equals("170107038")){
                if(pass.equals("12345")) {
                    System.out.println("Well paid with QazKom Card");
                    break;
                }
            }
        }
    }

}