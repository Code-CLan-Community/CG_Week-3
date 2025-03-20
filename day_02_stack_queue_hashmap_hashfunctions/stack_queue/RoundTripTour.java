import java.util.LinkedList;
import java.util.Queue;

class PetrolPump {
    int fuel, distanceToNext;  

    // Constructor to initialize petrol and distance for each pump
    PetrolPump(int fuel, int distanceToNext) {
        this.fuel = fuel;
        this.distanceToNext = distanceToNext;
    }
}

public class RoundTripTour {
    static int findStartPump(PetrolPump[] pumps) {
        int pumpCount = pumps.length;
        Queue<PetrolPump> pumpQueue = new LinkedList<>();
        int totalFuelSurplus = 0, currentBalance = 0, startIndex = 0;

        for (int i = 0; i < pumpCount; i++) {
            int netFuel = pumps[i].fuel - pumps[i].distanceToNext;
            totalFuelSurplus += netFuel;
            currentBalance += netFuel;

            pumpQueue.offer(pumps[i]);

            // If balance goes negative, remove pumps from the queue
            while (currentBalance < 0 && !pumpQueue.isEmpty()) {
                PetrolPump removedPump = pumpQueue.poll(); // Remove front element
                currentBalance -= (removedPump.fuel - removedPump.distanceToNext);
                startIndex++;
            }
        }

        return totalFuelSurplus >= 0 ? startIndex : -1;
    }

    public static void main(String[] args) {
        PetrolPump[] pumps = {
            new PetrolPump(4, 6),
            new PetrolPump(6, 5),
            new PetrolPump(7, 3),
            new PetrolPump(4, 5)
        };

        int startPump = findStartPump(pumps);
        System.out.println(startPump == -1 ? "No Solution" : "Start at pump " + startPump);
    }
}
