package Assignment4.templatemethod;

public class Main {
    public static void main(String[] args) {
        // Создание экземпляров проверок для разных типов продуктов
        QualityCheck foodCheck = new FoodQualityCheck();
        QualityCheck electronicsCheck = new ElectronicsQualityCheck();

        foodCheck.checkProduct(); // Проверка продуктов питания
        electronicsCheck.checkProduct(); // Проверка электроники
    }
}
