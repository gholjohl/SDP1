package Assignment3.command;

public class RemoteControl {
    private Command[] commands = new Command[6];

    public void setCommand(int slot, Command command) {
        commands[slot] = command;
    }

    public void pressButton(int slot) {
        if (commands[slot] != null) {
            commands[slot].execute();
        }
    }
}
