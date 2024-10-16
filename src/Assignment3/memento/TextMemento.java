package Assignment3.memento;

public class TextMemento {
    private final String textState;

    public TextMemento(String state) {
        this.textState = state;
    }

    public String getTextState() {
        return textState;
    }
}
