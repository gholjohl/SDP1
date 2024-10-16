package Assignment3.mediator;

public class Main {
    public static void main(String[] args) {
        HomeMediator mediator = new HomeMediatorImpl();

        mediator.addData("Датчик температуры: 25°C");
        mediator.addData("Датчик влажности: 60%");

        mediator.collectData();

        mediator.printReport();
    }
}
