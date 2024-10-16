package Assignment3.memento;

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        Caretaker caretaker = new Caretaker();

        editor.setText("Привет, мир!");
        caretaker.save(editor);

        editor.setText("Новое состояние текста.");
        caretaker.save(editor);

        editor.setText("Еще одно изменение.");
        caretaker.save(editor);

        System.out.println("Текущий текст: " + editor.getText());

        caretaker.undo(editor, 1);
        System.out.println("Восстановленный текст: " + editor.getText());
    }
}
