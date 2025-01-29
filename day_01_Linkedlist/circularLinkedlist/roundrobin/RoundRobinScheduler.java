class RoundRobinScheduler {
    private Process head;
    private Process current;
    private int timeQuantum;

    public RoundRobinScheduler(int timeQuantum) {
        this.head = null;
        this.current = null;
        this.timeQuantum = timeQuantum;
    }

    // Add a new process at the end
    public void addProcess(int id, int burstTime, int priority) {
        Process newProcess = new Process(id, burstTime, priority);
        if (head == null) {
            head = newProcess;
            head.next = head;
        } else {
            Process temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newProcess;
            newProcess.next = head;
        }
    }

    // Remove a process by Process ID after execution
    public void removeProcess(int id) {
        if (head == null) {
            return;
        }

        Process temp = head;
        Process prev = null;

        do {
            if (temp.processID == id) {
                if (temp == head) {
                    Process last = head;
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
    }

    // Simulate Round Robin Scheduling
    public void simulateScheduling() {
        if (head == null) {
            System.out.println("No processes in the queue!");
            return;
        }

        int totalTime = 0;
        int completedProcesses = 0;
        int processCount = countProcesses();
        int[] waitingTime = new int[processCount];
        int[] turnaroundTime = new int[processCount];

        current = head;

        System.out.println("\nExecuting Round Robin Scheduling:");
        while (completedProcesses < processCount) {
            if (current.remainingTime > 0) {
                System.out.println("Executing Process " + current.processID + " for "
                        + Math.min(timeQuantum, current.remainingTime) + " units.");
                
                totalTime += Math.min(timeQuantum, current.remainingTime);
                current.remainingTime -= timeQuantum;

                // If process is completed
                if (current.remainingTime <= 0) {
                    turnaroundTime[current.processID - 1] = totalTime;
                    waitingTime[current.processID - 1] = turnaroundTime[current.processID - 1] - current.burstTime;
                    completedProcesses++;
                    System.out.println("Process " + current.processID + " completed execution.");
                    removeProcess(current.processID);
                }
            }
            current = current.next; // Move to next process
        }

        displayAverageTimes(waitingTime, turnaroundTime, processCount);
    }

    // Display the list of processes
    public void displayProcesses() {
        if (head == null) {
            System.out.println("No processes in the queue!");
            return;
        }

        Process temp = head;
        System.out.println("\nProcesses in the queue:");
        do {
            System.out.println("ID: " + temp.processID + ", Burst Time: " + temp.burstTime + ", Priority: " + temp.priority);
            temp = temp.next;
        } while (temp != head);
    }

    // Calculate and display average waiting time and turn-around time
    private void displayAverageTimes(int[] waitingTime, int[] turnaroundTime, int processCount) {
        double avgWaitingTime = 0, avgTurnaroundTime = 0;

        System.out.println("\nProcess Execution Summary:");
        System.out.println("Process ID | Waiting Time | Turnaround Time");
        for (int i = 0; i < processCount; i++) {
            System.out.println(i + 1 + "          | " + waitingTime[i] + "            | " + turnaroundTime[i]);
            avgWaitingTime += waitingTime[i];
            avgTurnaroundTime += turnaroundTime[i];
        }

        avgWaitingTime /= processCount;
        avgTurnaroundTime /= processCount;

        System.out.println("\nAverage Waiting Time: " + avgWaitingTime);
        System.out.println("Average Turnaround Time: " + avgTurnaroundTime);
    }

    // Count total processes
    private int countProcesses() {
        if (head == null) {
            return 0;
        }
        int count = 0;
        Process temp = head;
        do {
            count++;
            temp = temp.next;
        } while (temp != head);
        return count;
    }
}