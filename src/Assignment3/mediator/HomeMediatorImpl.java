package Assignment3.mediator;

import java.util.ArrayList;
import java.util.List;

public class HomeMediatorImpl implements HomeMediator {
    private List<String> dataList = new ArrayList<>();

    @Override
    public void addData(String location) {
        dataList.add(location);
    }

    @Override
    public void notifyHumidityChange() {
        System.out.println("Изменение влажности в доме.");
    }

    @Override
    public void notifyTemperatureChange() {
        System.out.println("Изменение температуры в доме.");
    }

    @Override
    public void collectData() {

        System.out.println("Сбор данных:");
        for (String data : dataList) {
            System.out.println(data);
        }
    }

    @Override
    public void printReport() {

        System.out.println("Отчет:");
        for (String data : dataList) {
            System.out.println(data);
        }
    }
}
