class Solution {
    public int[] twoSum(int[] nums, int target) {
        int a=0,i, j ;

        for(i=0;i<nums.length;i++)
        {
            for(j=i+1;j<nums.length;j++)
            {
            a=nums[i]+nums[j];
            if(a==target)
            {
                //System.out.printf("%d %d",i,j);
                return new int[] {i,j} ;
            }
            }
        }  
    return new int[] {} ;
    }
}
