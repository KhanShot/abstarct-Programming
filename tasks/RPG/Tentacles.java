package Task3;

public class Tentacles extends MonsterDecorator{
    Monster monster;

    public Tentacles(Monster monster){
        this.monster = monster;
    }

    public int getAttackPower() {
        return monster.getAttackPower() + 7;
    }
    public String attack(){
        return monster.attack() + "The monster attacks you with its tentacles!";
    }
    public String fleeBattle(){
        return monster.fleeBattle() + "And torn off the tentacles!";
    }
}
