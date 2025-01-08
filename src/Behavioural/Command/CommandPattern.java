package Behavioural.Command;

interface Command {
    void execute();
}

class TextEditor{
    public void boldText(){
        System.out.println("Bolded");
    }

    public void italiseText(){
        System.out.println("Italised");
    }
}

class BoldCommand implements Command{
    private TextEditor textEditor;

    public BoldCommand(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    @Override
    public void execute() {
        textEditor.boldText();
    }
}

class ItaliseCommand implements Command{
    private TextEditor textEditor;

    public ItaliseCommand(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    @Override
    public void execute() {
        textEditor.italiseText();
    }
}

class Button {
    private Command command;

    public void setButton(Command command) {
        this.command = command;
    }

    public void click(){
        command.execute();
    }
}

public class CommandPattern {
    public static void main(String[] args) {

        TextEditor textEditor = new TextEditor();

        Button button = new Button();
        button.setButton(new BoldCommand(textEditor));

        button.click();

        button.setButton(new ItaliseCommand(textEditor));

        button.click();


    }
}
