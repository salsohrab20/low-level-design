package Behavioural.Memento;

public class TextEditorMain {
    public static void main(String[] args) {

        TextEditor textEditor = new TextEditor();
        Caretaker caretaker = new Caretaker();

        textEditor.write("Hello Salman");
        caretaker.saveState(textEditor);

        textEditor.write("Hello Sohrab");
        caretaker.saveState(textEditor);

        textEditor.write("Hello Ansari");
        caretaker.saveState(textEditor);

        caretaker.undo(textEditor);

        System.out.println(textEditor.getContent());
    }
}
