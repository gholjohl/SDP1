package Assignment4.visitor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<File> files = new ArrayList<>(); // Список файлов
        files.add(new TextFile("Hello World!")); // Добавление текстового файла
        files.add(new ExecutableFile("Main.class")); // Добавление исполняемого файла

        // Создание посетителей
        Visitor antivirusVisitor = new AntivirusVisitor();
        Visitor reportVisitor = new ReportVisitor();

        // Применение посетителей к файлам
        for (File file : files) {
            file.accept(antivirusVisitor); // Проверка на вирусы
            file.accept(reportVisitor); // Генерация отчета
        }
    }
}
