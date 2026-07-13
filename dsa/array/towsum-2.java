class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int p=0;
        int n=numbers.length;
        int q=n-1;
        int sum=0;
        while(p<q)
        {
            sum=numbers[p]+numbers[q];
            if(sum==target)
            {
                    return new int[] {p+1,q+1};
            }
            else if(sum>target)
            {
                q--;
            }
            else
            {
                p++;
            }
        }
        return new int[] {p+1,q+1};  
    }
}
