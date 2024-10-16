package Assignment3.mediator;

public interface HomeMediator {
    void addData(String location);
    void notifyHumidityChange();
    void notifyTemperatureChange();
    void collectData();
    void printReport();
}
