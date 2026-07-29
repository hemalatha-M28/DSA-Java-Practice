class Solution {
    public int maximumProduct(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int sum1,sum2;
        sum1=nums[0]*nums[1]*nums[n-1];
        sum2=nums[n-1]*nums[n-2]*nums[n-3];
       return Math.max(sum1,sum2);
    }
}
