package Assignment4.visitor;

public class TextFile implements File {
    private String content; // Содержимое текстового файла

    public TextFile(String content) {
        this.content = content; // Инициализация содержимого
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this); // Принять посетителя
    }

    public String getContent() {
        return content; // Получение содержимого файла
    }
}
