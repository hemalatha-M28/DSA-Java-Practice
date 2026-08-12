class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) 
    {
        int n=nums.length;
        int count=0;
        int sum1=0;
        int sum2=0;
        int left1=0;
        int left2=0;
        for(int right=0;right<n;right++)
        {
            
            sum1+=nums[right];
            while(sum1>goal)
            {
                sum1-=nums[left1];
                left1++;
            }
            sum2+=nums[right];
            while(sum2>=goal && left2<=right)
            {
                sum2-=nums[left2];
                left2++;
            }
            count+=left2-left1;
        }
        return count;
    }
}
