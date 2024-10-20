package Assignment4.state;

public class StoppedState implements PlayerState {
    private Player player;

    public StoppedState(Player player) {
        this.player = player;
    }

    @Override
    public void play() {
        System.out.println("Начало воспроизведения.");
        player.setState(player.getPlayingState());
    }

    @Override
    public void pause() {
        System.out.println("Нельзя поставить на паузу. Плеер остановлен.");
    }

    @Override
    public void stop() {
        System.out.println("Плеер уже остановлен.");
    }
}
