import java.util.Scanner;

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
public class RoundRobin{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Time Quantum: ");
        int timeQuantum = scanner.nextInt();
        
        RoundRobinScheduler scheduler = new RoundRobinScheduler(timeQuantum);

        scheduler.addProcess(1, 10, 2);
        scheduler.addProcess(2, 5, 1);
        scheduler.addProcess(3, 8, 3);
        scheduler.addProcess(4, 6, 2);

        scheduler.displayProcesses();
        scheduler.simulateScheduling();

        scanner.close();
    }
}
