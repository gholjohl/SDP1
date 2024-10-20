package Assignment4.visitor;

public interface Visitor {
    void visit(TextFile textFile); // Обработка текстового файла
    void visit(ExecutableFile executableFile); // Обработка исполняемого файла
}
