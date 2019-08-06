import java.util.Stack;

public class CompletedCommands {
    private Stack<AllCommands> completed = new Stack<>();

    public void push(AllCommands c) {
        completed.push(c);
    }

    public AllCommands pop() {
        return completed.pop();
    }

    public boolean isEmpty() { return completed.isEmpty(); }
}