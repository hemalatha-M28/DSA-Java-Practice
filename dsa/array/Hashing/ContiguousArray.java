class Solution {
    public int findMaxLength(int[] nums) 
    {
       int sum=0;
       int i=0;   
       int n=nums.length;
       int maxi=0;
       HashMap<Integer,Integer> map=new HashMap<>();
       map.put(0,-1);
       for(i=0;i<n;i++)
       {
            if(nums[i]==0)
            {
                sum += -1;
            }
            else
            {
                sum += 1;
            }
            
            if(map.containsKey(sum))
            {
                maxi=Math.max(maxi,i-map.get(sum));
            }
            else
            {
                map.put(sum,i);
            }
       }
       return maxi;
    }
}
