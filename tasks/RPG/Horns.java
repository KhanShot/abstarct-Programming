package Task3;

public class Horns extends MonsterDecorator{
    Monster monster;

    public Horns(Monster monster){
        this.monster = monster;
    }

    public int getAttackPower() {
        return monster.getAttackPower() + 5;
    }
    public String attack(){
        return monster.attack() + "The monster attacks you with its horns!";
    }
    public String fleeBattle(){
        return monster.fleeBattle() + "And broke his horns!";
    }
}
