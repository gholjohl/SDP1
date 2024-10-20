package Assignment4.state;
public class Main {
    public static void main(String[] args) {
        Player player = new Player(); // Создаем экземпляр плеера

        // Тестирование состояний плеера
        player.play();  // Начало воспроизведения
        player.pause(); // Пауза
        player.play();  // Возобновление воспроизведения
        player.stop();  // Остановка плеера
    }
}
