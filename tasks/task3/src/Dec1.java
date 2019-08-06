public class Dec1 extends MonsterDecorator{
    Monster monster;

    public Dec1(Monster monster){
        this.monster = monster;
    }

    public int getAttackPower() {
        return monster.getAttackPower() + 7;
    }
    public String attack(){
        return monster.attack() + "The monster attacks you with  Дубиной!";
    }
    public String fleeBattle(){
        return monster.fleeBattle() + "And torn off the Дубинкаларын!";
    }
}