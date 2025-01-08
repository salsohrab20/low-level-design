package Behavioural.Memento;

import java.util.Stack;

//Manage memento(snapshots of the text editor class)
public class Caretaker {
    private final Stack<EditorMemento> history = new Stack();

    public void saveState(TextEditor textEditor) {
        history.push(textEditor.save());
    }

    public void undo(TextEditor textEditor){
        if(!history.empty()){
            history.pop();
            textEditor.restore(history.peek());
        }
    }

}
