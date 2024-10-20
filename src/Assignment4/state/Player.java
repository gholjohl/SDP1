package Assignment4.state;
public class Player {
    private PlayerState playingState; // Состояние воспроизведения
    private PlayerState pausedState; // Состояние паузы
    private PlayerState stoppedState; // Состояние остановки

    private PlayerState currentState; // Текущее состояние плеера

    public Player() {
        // Инициализация всех состояний
        this.playingState = new PlayingState(this);
        this.pausedState = new PausedState(this);
        this.stoppedState = new StoppedState(this);

        this.currentState = stoppedState; // Начальное состояние - остановлено
    }

    public void setState(PlayerState state) {
        this.currentState = state; // Изменение текущего состояния
    }

    public PlayerState getPlayingState() {
        return playingState; // Получение состояния воспроизведения
    }

    public PlayerState getPausedState() {
        return pausedState; // Получение состояния паузы
    }

    public PlayerState getStoppedState() {
        return stoppedState; // Получение состояния остановки
    }

    public void play() {
        currentState.play(); // Делегируем вызов текущему состоянию
    }

    public void pause() {
        currentState.pause(); // Делегируем вызов текущему состоянию
    }

    public void stop() {
        currentState.stop(); // Делегируем вызов текущему состоянию
    }
}
