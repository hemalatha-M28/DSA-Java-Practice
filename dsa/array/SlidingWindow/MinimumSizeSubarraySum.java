class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int left=0;
        int right=0;
        int sum=0;
        int i,mini=Integer.MAX_VALUE;
        for(right=0;right<n;right++)
        {

            sum+=nums[right];

        while(sum>=target)
        {
            sum-=nums[left];
            mini=Math.min(mini,right-left+1);
            left++;
        }

        }
        if(mini==Integer.MAX_VALUE)
        {
            return 0;
        }
        return mini;
    }
}
