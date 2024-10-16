package Assignment3.command;

public class PreviousChannelCommand implements Command {
    private Television tv;

    public PreviousChannelCommand(Television tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.previousChannel();
    }
}
