class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int i,p=0;
        
        for(i=0;i<n;i++)
        {
          if(nums[i]!=0)
          {
            nums[p]=nums[i];
            p++;
            }
        }
        for(i=p;i<n;i++)
        {
            nums[i]=0;
        }
        
    }
}
```
