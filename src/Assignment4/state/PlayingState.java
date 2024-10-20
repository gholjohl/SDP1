package Assignment4.state;

public class PlayingState implements PlayerState {
    private Player player;

    public PlayingState(Player player) {
        this.player = player;
    }

    @Override
    public void play() {
        System.out.println("Уже воспроизводится.");
    }

    @Override
    public void pause() {
        System.out.println("Плеер на паузе.");
        player.setState(player.getPausedState());
    }

    @Override
    public void stop() {
        System.out.println("Плеер остановлен.");
        player.setState(player.getStoppedState());
    }
}
