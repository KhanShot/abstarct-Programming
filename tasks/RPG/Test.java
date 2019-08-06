package Task3;

public class Test {
    public static void main(String args[]){
        Monster troll = new Troll();
        System.out.println("Attack power of troll is :" + troll.getAttackPower() );
        System.out.println(troll.attack());
        System.out.println(troll.fleeBattle());

        Monster boo = new Boo();
        System.out.println("Attack power of boo is :" + boo.getAttackPower() );
        System.out.println(boo.attack());
        boo = new Horns(boo);
        System.out.println("Attack power of boo with horn is :" + boo.getAttackPower() );
        System.out.println(boo.attack());
        boo = new Horns(boo);
        System.out.println("Attack power of boo with two horn is :" + boo.getAttackPower() );


    }
}
