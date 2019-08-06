public class Test extends RemoteControl {
    public static void main(String[] args) {


        RemoteControl control = new RemoteControl();
        Light light = new Light();
        control.setCommand(new LightOnCommand(light));
        control.buttonPressed();
        control.setCommand(new LightOffCommand(light));
        control.buttonPressed();
        control.setCommand(new LightOnCommand(light));
        control.buttonPressed();
        control.setCommand(new LightOffCommand(light));
        control.buttonPressed();
        control.undo();
        control.undo();
    }
}
