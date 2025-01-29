class Process {
    int processID;
    int burstTime;
    int remainingTime;
    int priority;
    Process next;

    public Process(int id, int burstTime, int priority) {
        this.processID = id;
        this.burstTime = burstTime;
        this.remainingTime = burstTime; // Track remaining burst time
        this.priority = priority;
        this.next = null;
    }
}