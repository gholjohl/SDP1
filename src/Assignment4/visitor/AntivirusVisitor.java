package Assignment4.visitor;


public class AntivirusVisitor implements Visitor {
    @Override
    public void visit(TextFile textFile) {
        System.out.println("Проверка текстового файла на запрещенные слова: " + textFile.getContent());
    }

    @Override
    public void visit(ExecutableFile executableFile) {
        System.out.println("Проверка исполняемого файла на наличие вредоносного кода.");
    }
}
