package Assignment3.mediator;

public class HumiditySensor implements Sensor {
    private HomeMediator mediator;
    private String location;

    public HumiditySensor(HomeMediator mediator, String location) {
        this.mediator = mediator;
        this.location = location;
        mediator.addData(location);
    }

    @Override
    public void sendData() {
        System.out.println("Отправка данных о влажности из " + location);
        mediator.notifyHumidityChange();
    }
}
