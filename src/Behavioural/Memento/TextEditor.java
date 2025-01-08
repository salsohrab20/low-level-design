package Behavioural.Memento;

public class TextEditor {
    public String content;

    public void write(String text){
        this.content=text;
    }
    public String getContent() {
        return content;
    }

    //saves the current state of the editor
    public EditorMemento save(){
        return new EditorMemento(content);
    }

    //Restore : Memento -> Update the state of current content
    public void restore(EditorMemento memento){
        content= memento.getContent();;
    }


}
