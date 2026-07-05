class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n=nums.length;
        int sum1=nums[0];
        int sum2=nums[0];
        int max=nums[0];
        int min=nums[0];
        int temp1;
        int temp2;
        int sum=nums[0];
        for(int i=1;i<n;i++)
        {
            temp1=sum1;
            temp2=sum2;
            sum1=Math.max(nums[i],temp1+nums[i]);
            sum2=Math.min(nums[i],temp2+nums[i]);
            sum=sum+nums[i];
            if(sum1>max)
            {
                max=sum1;
            }
            if(sum2<min)
            {
                min=sum2;
            }

        }
            if(max<0)
            { 
                return max;
            }
        return Math.max(max,sum-min);
    }
}
