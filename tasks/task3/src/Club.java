public class Club extends MonsterDecorator{
    Monster monster;

    public Club(Monster monster){
        this.monster = monster;
    }

    public int getAttackPower() {
        return monster.getAttackPower() + 50;
    }
    public String attack(){
        return monster.attack() + "The monster get attacked at you with a club!";
    }
    public String fleeBattle(){
        return monster.fleeBattle() + "And loses his club while running!";
    }
}
