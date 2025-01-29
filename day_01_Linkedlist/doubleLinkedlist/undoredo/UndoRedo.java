


public class UndoRedo {
   final private DocumentHistory history;

    public UndoRedo() {
        history = new DocumentHistory();
    }

    public void addText(String newText) {
        history.addState(newText);
    }

    public void undo() {
        history.undo();
    }

    public void redo() {
        history.redo();
    }

    public String getCurrentText() {
        return history.getCurrentText();
    }

    public static void main(String[] args) {
        UndoRedo editor = new UndoRedo();

        editor.addText("Hello, ");
        editor.addText("Hello, world!");
        editor.addText("Hello, world! How are you?");

        System.out.println("Current text: " + editor.getCurrentText()); // Output: Hello, world! How are you?

        editor.undo();
        System.out.println("After undo: " + editor.getCurrentText()); // Output: Hello, world!

        editor.redo();
        System.out.println("After redo: " + editor.getCurrentText()); // Output: Hello, world! How are you?

        editor.undo();
        editor.undo();
        System.out.println("After two undo: " + editor.getCurrentText()); // Output: Hello, 

        // Add more states (up to the limit)
        for (int i = 0; i < DocumentHistory.MAX_HISTORY_SIZE + 5; i++) {
            editor.addText("State " + i);
        }

        // Undo and redo operations will now be limited by the history size
    }
}