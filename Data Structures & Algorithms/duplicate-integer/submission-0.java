class Solution {
    public boolean hasDuplicate(int[] nums) {
        java.util.Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            int j = i + 1;
            if (nums[i] == nums[j]) {
                return true;
            }
        }
        return false;
    }
}