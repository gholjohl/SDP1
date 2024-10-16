package Assignment3.memento;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    private List<TextMemento> history = new ArrayList<>();

    public void save(TextEditor editor) {
        history.add(editor.save());
    }

    public void undo(TextEditor editor, int index) {
        if (index >= 0 && index < history.size()) {
            editor.restore(history.get(index));
        } else {
            System.out.println("Неверный индекс для восстановления.");
        }
    }
}
