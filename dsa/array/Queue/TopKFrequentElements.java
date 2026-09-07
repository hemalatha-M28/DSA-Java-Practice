class Solution {
    public int[] topKFrequent(int[] nums, int k) 
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n=nums.length;
        int[] ans= new int[k];
        PriorityQueue <Integer> pq = new PriorityQueue<>((a,b)->map.get(a)-map.get(b));
        for(int i=0;i<n;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int key : map.keySet())
        {
            int freq = map.get(key);
            pq.offer(key);
            if(pq.size()>k)
            {
                pq.poll();
            }
        }
        for(int i=0;i<k;i++)
        {
            ans[i]=pq.poll();
        }
        return ans;
    }
}
