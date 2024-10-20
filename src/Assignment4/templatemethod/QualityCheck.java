package Assignment4.templatemethod;

public abstract class QualityCheck {
    public final void checkProduct() {
        checkAppearance(); // Проверка внешнего вида
        checkSpecificCharacteristics(); // Проверка специфических характеристик
        generateReport(); // Генерация отчета
    }

    protected void checkAppearance() {
        // Общая реализация проверки внешнего вида
        System.out.println("Проверка внешнего вида.");
    }

    protected abstract void checkSpecificCharacteristics();

    protected void generateReport() {
        // Генерация отчета
        System.out.println("Генерация отчета о проверке.");
    }
}
