import java.util.HashMap;

public class CheckPair {
    static boolean hasPair(int[] nums, int target) {
        HashMap<Integer, Boolean> numMap = new HashMap<>();

        for (int num : nums) {
            if (numMap.containsKey(target - num)) {
                return true;
            }
            numMap.put(num, true);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 4, 6, 8, 10};
        int target = 14;
        
        System.out.println(hasPair(nums, target) ? "Pair Found" : "No Pair Found");
    }
}
