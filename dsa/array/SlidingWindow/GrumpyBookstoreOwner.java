class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) 
    {
        int n= customers.length;
        int maxi=0;
        int cus=0;
        int sum=0;
        for(int i=0;i<minutes;i++)
        {
            if(grumpy[i]!=1)
            {
                cus+=customers[i];
            }
            else
            {
                sum+=customers[i];
            }
        }
        maxi=Math.max(maxi,sum);
        for(int j=minutes;j<n;j++)
        {

            if(grumpy[j]!=1)
            {
                cus+=customers[j];
            }
                if(grumpy[j-minutes]==1)
                {
                    sum-=customers[j-minutes];
                }
            if(grumpy[j]==1)
            {
               sum+=customers[j];
            }
            maxi=Math.max(maxi,sum);
            
        }
        
        
       return maxi+cus; 
    }
}
