class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int left = 0; left < nums.length; left++) {
            for (int right = left + 1; right < nums.length; right++) {
                int sum = nums[left] + nums[right];
                if (sum == target) {
                    return new int[]{left, right};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
