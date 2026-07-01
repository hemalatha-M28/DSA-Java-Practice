class Solution {
    public int maxProduct(int[] nums) {
        int max = nums[0];
        int sum1 = nums[0];
        int sum2 = nums[0];
        int temp = 0;
        for (int i = 1; i < nums.length; i++) {
            temp = sum1;
            sum1 = Math.max(nums[i], Math.max(temp * nums[i], sum2 * nums[i]));
            sum2 = Math.min(nums[i], Math.min(sum2 * nums[i], temp * nums[i]));
            if (sum1 > max) {
                max = sum1;
            } else if (sum2 > max) {
                max = sum2;
            }
        }
        return max;
    }
}
