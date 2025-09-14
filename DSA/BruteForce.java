package DSA;

public class BruteForce {
    public static int[] twoSumBruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) { // j starts from i+1 to avoid using same element
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution found");
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] indices = twoSumBruteForce(nums, target);
        System.out.println("Indices: [" + indices[0] + ", " + indices[1] + "]");
        // Output: Indices: [0, 1]
    }
}