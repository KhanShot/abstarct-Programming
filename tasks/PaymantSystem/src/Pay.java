public abstract class Pay {
    private JustPay pay;
    public void setPay(JustPay pay){
        this.pay = pay;
    }
    public void PayPerform(){
        pay.pay();
    }
}