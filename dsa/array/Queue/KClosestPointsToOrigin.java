class Solution 
{
    public int[][] kClosest(int[][] points, int k) 
    {
        int n=points.length;
        int[][] ans=new int[k][2];
        PriorityQueue<int[]> pq =new PriorityQueue<>((a, b) -> (a[0]*a[0]+a[1]*a[1]) - (b[0]*b[0]+b[1]*b[1]));
        for(int i=0;i<n;i++)
        {   
            pq.offer(points[i]);
        }
        for(int i=0;i<k;i++)
        {
                ans[i]=pq.poll();
        }
    return ans;
    }
}
