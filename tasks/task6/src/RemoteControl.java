import java.util.Stack;

public class RemoteControl {
    private Command slot;
    public RemoteControl(){}
    private Stack<Command> stack = new Stack<Command>();
    public void setCommand(Command command){
        this.slot = command;
    }
    public void buttonPressed(){
        slot.execute();
        stack.push(slot);
    }
    public void undo(){
        stack.pop().undo();
    }
    public void list(){
        System.out.println(stack);
        for (int i = 0; i < stack.size(); i++) {
            stack.get(i).undo();

        }
    }
}
