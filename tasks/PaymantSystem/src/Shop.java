import java.util.Scanner;

public class Shop extends Pay{
    JustPay pay;
    public static void main(String[] args) throws Exception {

        Shop shop = new Shop();
        int selected;
        int total = 0;
        String sel = "y";
        while (!sel.equals("n")) {
            Scanner sca = new Scanner(System.in);
            System.out.println("Please, select a Product: \n" +
                    "1 - Mother Board   $500\n" +
                    "2 - CPU   $600\n " +
                    "3 - HDD   $350\n" +
                    "4 - Memory $280 ");
            selected = sca.nextInt();
            System.out.print("Count: ");
            int count = sca.nextInt();
            if (selected == 1)
                total = total + 500 * count;
            if (selected == 2) total += 600 * count;
            if (selected == 3) total += 350 * count;
            if (selected == 4) total += 280 * count;
            System.out.println("Do you want to continue selecting product? Y/N : ");
            sel = sca.next();
            if (sel.equals("n")) {
                break;
            }

        }
        System.out.println("total costs: " + total);
        System.out.println("Please, select a payment method: \n" +
                "1 - Qazkom\n" +
                "2 - KaspiBank\n" +
                "3 - PayPall");
        Scanner as = new Scanner(System.in);
        int pay = as.nextInt();
        if (pay == 1) {
                shop.setPay(new Qazkom());
                shop.PayPerform();
        }
        if(pay == 2){
            shop.setPay(new KaspiBank());
            shop.PayPerform();
        }
    }


    @Override
    public void setPay(JustPay pay){
        this.pay = pay;
    }
}
