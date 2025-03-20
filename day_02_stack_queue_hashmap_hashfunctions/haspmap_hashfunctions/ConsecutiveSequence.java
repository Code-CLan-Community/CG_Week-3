import java.util.HashSet;

public class ConsecutiveSequence {
    static int findLongest(int[] nums) {
        HashSet<Integer> numSet = new HashSet<>();
        int longest = 0;

        for (int num : nums) {
            numSet.add(num);
        }

        for (int num : nums) {
            if (!numSet.contains(num - 1)) {
                int count = 1;
                int current = num;
                
                while (numSet.contains(current + 1)) {
                    count++;
                    current++;
                }

                longest = Math.max(longest, count);
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        
        System.out.println("Longest Sequence Length: " + findLongest(nums));
    }
}
