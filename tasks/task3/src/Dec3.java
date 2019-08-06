public class Dec3 extends MonsterDecorator{
    Monster monster;

    public Dec3(Monster monster){
        this.monster = monster;
    }

    public int getAttackPower() {
        return monster.getAttackPower() + 20;
    }
    public String attack(){
        return monster.attack() + "The monster swings at you with a corporation!";
    }
    public String fleeBattle(){
        return monster.fleeBattle() + "And loses his corporation while running!";
    }
}
