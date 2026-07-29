class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int maxi=0;
        int mini=0;
        int d;
        int p=0,q=n-1;
        while(p<q)
        {
            mini=Math.min(height[p],height[q]);
            d=q-p;
            maxi = Math.max(maxi, mini * d);
            if(height[p]<height[q])
            {
            p++;
            }
            else
            {
            q--;
            }
           
        }
        return maxi;
    }
}
