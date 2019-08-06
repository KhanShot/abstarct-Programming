package Task3;

public class Corporation extends MonsterDecorator{
    Monster monster;

    public Corporation(Monster monster){
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
