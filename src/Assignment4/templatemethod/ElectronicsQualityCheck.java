package Assignment4.templatemethod;

public class ElectronicsQualityCheck extends QualityCheck {
    @Override
    protected void checkSpecificCharacteristics() {
        System.out.println("Проверка работоспособности и наличия гарантии.");
    }
}
