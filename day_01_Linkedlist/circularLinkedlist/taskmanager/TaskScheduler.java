class TaskScheduler {
    private Task head;
    private Task current;

    public TaskScheduler() {
        this.head = null;
        this.current = null;
    }

    // Add a task at the beginning
    public void addTaskAtBeginning(int id, String name, int priority, String date) {
        Task newTask = new Task(id, name, priority, date);
        if (head == null) {
            head = newTask;
            head.next = head;
        } else {
            Task temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            newTask.next = head;
            temp.next = newTask;
            head = newTask;
        }
    }

    // Add a task at the end
    public void addTaskAtEnd(int id, String name, int priority, String date) {
        Task newTask = new Task(id, name, priority, date);
        if (head == null) {
            head = newTask;
            head.next = head;
        } else {
            Task temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newTask;
            newTask.next = head;
        }
    }

    // Add a task at a specific position
    public void addTaskAtPosition(int id, String name, int priority, String date, int position) {
        if (position <= 0) {
            System.out.println("Invalid position!");
            return;
        }

        Task newTask = new Task(id, name, priority, date);
        if (head == null || position == 1) {
            addTaskAtBeginning(id, name, priority, date);
            return;
        }

        Task temp = head;
        int count = 1;
        while (count < position - 1 && temp.next != head) {
            temp = temp.next;
            count++;
        }
        newTask.next = temp.next;
        temp.next = newTask;
    }

    // Remove a task by Task ID
    public void removeTask(int id) {
        if (head == null) {
            System.out.println("Task list is empty!");
            return;
        }

        Task temp = head;
        Task prev = null;

        // Finding the task to delete
        do {
            if (temp.taskID == id) {
                if (temp == head) {
                    // Deleting the head node
                    Task last = head;
                    while (last.next != head) {
                        last = last.next;
                    }
                    head = head.next;
                    last.next = head;
                    return;
                } else {
                    prev.next = temp.next;
                    return;
                }
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);

        System.out.println("Task with ID " + id + " not found!");
    }

    // View the current task and move to the next
    public void viewCurrentTask() {
        if (current == null) {
            current = head;
        }
        if (current != null) {
            System.out.println("Current Task ID: " + current.taskID + ", Name: " + current.taskName
                    + ", Priority: " + current.priority + ", Due Date: " + current.dueDate);
            current = current.next; // Move to next task
        } else {
            System.out.println("No tasks available!");
        }
    }

    // Display all tasks
    public void displayTasks() {
        if (head == null) {
            System.out.println("No tasks available!");
            return;
        }

        Task temp = head;
        System.out.println("Task List:");
        do {
            System.out.println("ID: " + temp.taskID + ", Name: " + temp.taskName
                    + ", Priority: " + temp.priority + ", Due Date: " + temp.dueDate);
            temp = temp.next;
        } while (temp != head);
    }

    // Search for a task by Priority
    public void searchByPriority(int priority) {
        if (head == null) {
            System.out.println("No tasks available!");
            return;
        }

        Task temp = head;
        boolean found = false;
        do {
            if (temp.priority == priority) {
                System.out.println("Task Found - ID: " + temp.taskID + ", Name: " + temp.taskName
                        + ", Due Date: " + temp.dueDate);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found) {
            System.out.println("No tasks found with priority " + priority);
        }
    }
}

