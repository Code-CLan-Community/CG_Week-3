public class TaskManager {
    public static void main(String[] args) {
        TaskScheduler scheduler = new TaskScheduler();
        
        scheduler.addTaskAtEnd(101, "Design Database", 2, "2025-02-10");
        scheduler.addTaskAtEnd(102, "Develop API", 1, "2025-02-12");
        scheduler.addTaskAtEnd(103, "UI/UX Review", 3, "2025-02-15");

        scheduler.displayTasks();

        System.out.println("\nViewing Current Tasks Sequentially:");
        scheduler.viewCurrentTask();
        scheduler.viewCurrentTask();
        scheduler.viewCurrentTask();
        scheduler.viewCurrentTask();  // Circular nature test

        System.out.println("\nAdding a Task at Beginning:");
        scheduler.addTaskAtBeginning(100, "Project Kickoff", 1, "2025-02-05");
        scheduler.displayTasks();

        System.out.println("\nRemoving Task with ID 102:");
        scheduler.removeTask(102);
        scheduler.displayTasks();

        System.out.println("\nSearching for Priority 3 tasks:");
        scheduler.searchByPriority(3);
    }
}
