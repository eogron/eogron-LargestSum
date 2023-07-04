
import java.util.List;

public class LargestSum {
    /**
     * Get the largest possible sum that can be obtained from a pair of values in the list. A number can't be added
     * to itself, unless there are duplicates.
     *
     * @param nums a list of ints.
     * @return the largest possible sum of separate numbers from nums.
     */
    public int bigSum(List<Integer> nums){
        int a, b, temp;
        a = b = Integer.MIN_VALUE;
        for (int i = 0; i < nums.size(); i++) {
            if (a < nums.get(i)) {
                b = Math.max(a, b);
                a = nums.get(i);
            } else if (b < nums.get(i)) {
                a = Math.max(a, b);
                b = nums.get(i);
            }
        }
        return a + b;
    }
}