package Assignment3.mediator;
public class LightSensor implements Sensor {
    private HomeMediator mediator;
    private String lightLevel;

    public LightSensor(HomeMediator mediator, String lightLevel) {
        this.mediator = mediator;
        this.lightLevel = lightLevel;
    }

    @Override
    public void sendData() {
        mediator.addData("Уровень освещенности: " + lightLevel);
    }
}
