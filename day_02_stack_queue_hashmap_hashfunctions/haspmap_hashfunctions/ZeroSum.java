import java.util.*;

public class ZeroSum {
    static List<int[]> findSubarrays(int[] nums) {
        Map<Integer, List<Integer>> sumMap = new HashMap<>();
        List<int[]> result = new ArrayList<>();
        int sum = 0;
        
        sumMap.put(0, new ArrayList<>(List.of(-1))); 
        
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (sumMap.containsKey(sum)) {
                for (int start : sumMap.get(sum)) {
                    result.add(new int[]{start + 1, i});
                }
            }

            sumMap.putIfAbsent(sum, new ArrayList<>());
            sumMap.get(sum).add(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {3, 4, -7, 1, 2, -6, 3, 1, -4};
        List<int[]> result = findSubarrays(nums);
        
        for (int[] subarray : result) {
            System.out.println("From index " + subarray[0] + " to " + subarray[1]);
        }
    }
}
