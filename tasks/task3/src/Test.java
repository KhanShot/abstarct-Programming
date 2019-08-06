public class Test {
    public static void main(String args[]){
        Monster troll = new Monster();
        System.out.println("Attack power of troll is :" + troll.getAttackPower() );
        System.out.println(troll.attack());
        System.out.println(troll.fleeBattles);
        System.out.println(troll.fleeBattle());
        Monster monster2 = new Monster2();
        System.out.println("Attack power of Monster is :" + monster2.getAttackPower() );
        System.out.println(monster2.attack());
        monster2 = new Dec1(monster2);
        System.out.println("Attack power of Monster with horn is :" + monster2.getAttackPower() );
        System.out.println(monster2.attack());
        monster2 = new Dec1(monster2);
        System.out.println(monster2.fleeBattle());
        System.out.println("Attack power of Monster with two horn is :" + monster2.getAttackPower() );


    }
}
