class Solution {
    public int lastStoneWeight(int[] stones) 
    {
        PriorityQueue <Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        int n=stones.length;
        int ans=0;
        for(int i=0;i<n;i++)
        {
            maxHeap.offer(stones[i]);
        }
        while(maxHeap.size()>1)
        {
            int s1=maxHeap.poll();
            int s2=maxHeap.poll();
                if(s1!=s2)
                {
                    maxHeap.offer(s1-s2);
                }
       }
       if(!maxHeap.isEmpty())
       {
        ans=maxHeap.poll();
       }
        return ans;
        
    }
}
