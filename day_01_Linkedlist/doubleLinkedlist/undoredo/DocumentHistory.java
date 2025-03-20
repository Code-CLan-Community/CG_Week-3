class DocumentHistory {
    static final int MAX_HISTORY_SIZE = 10;
    private DocumentState head, tail;
    private DocumentState current;

    public DocumentHistory() {
        current = new DocumentState(""); // Initial empty state
        head = tail = current;
    }

    public void addState(String newText) {
        DocumentState newState = new DocumentState(newText);

        if (current != null) {
            current.next = newState;
            newState.prev = current;
        }

        current = newState;

        // Remove oldest state if history exceeds limit
        if (tail.prev != null) {
            tail.prev.next = null;
            tail = tail.prev;
        }

        if (head.next == null) {
            head = current;
        }
    }

    public void undo() {
        if (current.prev != null) {
            current = current.prev;
        }
    }

    public void redo() {
        if (current.next != null) {
            current = current.next;
        }
    }

    public String getCurrentText() {
        return current.text;
    }
}
