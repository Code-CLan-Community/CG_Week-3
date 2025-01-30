import java.util.HashMap;

class TwoSumChecker {
    static int[] findPair(int[] nums, int target) {
        HashMap<Integer, Integer> numMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int needed = target - nums[i];

            if (numMap.containsKey(needed)) {
                return new int[]{numMap.get(needed), i};
            }

            numMap.put(nums[i], i);
        }
        return new int[]{-1, -1}; 
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = findPair(nums, target);
        if (result[0] == -1) {
            System.out.println("No Pair Found");
        } else {
            System.out.println("Pair found at indices: " + result[0] + ", " + result[1]);
        }
    }
}
