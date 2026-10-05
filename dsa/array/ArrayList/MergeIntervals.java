class Solution {
    public int[][] merge(int[][] intervals) 
    {
        int n=intervals.length;
        Arrays.sort(intervals,(a,b)-> a[0]-b[0]);
        List <int[]> alist = new ArrayList<>();
        int curstart=intervals[0][0];
        int curend=intervals[0][1];
        for(int i=1;i<n;i++)
        {
            if(curend>=intervals[i][0])
            {
                curend = Math.max(curend, intervals[i][1]);
                
            }
            else
            {
                alist.add(new int[]{curstart, curend});
                curstart = intervals[i][0];
                curend = intervals[i][1];

            }

        }
        alist.add(new int[]{curstart,curend});
        return alist.toArray(new int[alist.size()][]);
    }
}
