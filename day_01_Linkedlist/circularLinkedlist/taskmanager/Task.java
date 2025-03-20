class Task {
    int taskID;
    String taskName;
    int priority;
    String dueDate;
    Task next;

    public Task(int id, String name, int pri, String date) {
        this.taskID = id;
        this.taskName = name;
        this.priority = pri;
        this.dueDate = date;
        this.next = null;
    }
}