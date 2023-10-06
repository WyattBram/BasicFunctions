
//Takes an array of ints and returns the indeces of the two numbers that add up to get the target.
public class Soultion {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length -1; j > 0; j--) {
                if (nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[0];
    }
}
