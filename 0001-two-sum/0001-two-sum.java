import java.util.*;
import java.lang.*;
import java.io.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        Solution solution = new Solution();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int[] nums = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            nums[i] = Integer.parseInt(str[i]);
        }
        int target = Integer.parseInt(br.readLine());
        int[] result = solution.twoSum(nums, target);
        if (result != null) {
            System.out.println(Arrays.toString(result));
        } else {
            System.out.println("No pair found that sums to " + target);
        }
    }
}
