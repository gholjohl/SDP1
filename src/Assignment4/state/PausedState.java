package Assignment4.state;

public class PausedState implements PlayerState {
    private Player player;

    public PausedState(Player player) {
        this.player = player;
    }

    @Override
    public void play() {
        System.out.println("Возобновление воспроизведения.");
        player.setState(player.getPlayingState());
    }

    @Override
    public void pause() {
        System.out.println("Уже на паузе.");
    }

    @Override
    public void stop() {
        System.out.println("Плеер остановлен.");
        player.setState(player.getStoppedState());
    }
}
