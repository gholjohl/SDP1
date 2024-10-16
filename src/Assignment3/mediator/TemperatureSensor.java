package Assignment3.mediator;

public class TemperatureSensor implements Sensor {
    private HomeMediator mediator;
    private String temperature;

    public TemperatureSensor(HomeMediator mediator, String temperature) {
        this.mediator = mediator;
        this.temperature = temperature;
    }

    @Override
    public void sendData() {
        mediator.addData("Температура: " + temperature);
    }
}
