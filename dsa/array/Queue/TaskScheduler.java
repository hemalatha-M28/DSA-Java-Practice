class Solution {
    public int leastInterval(char[] tasks, int n) 
    {
        HashMap <Character,Integer> map = new HashMap<>();
        PriorityQueue <Character> pq = new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
        int l=tasks.length;
        for(int i=0;i<l;i++)
        {
            map.put(tasks[i],map.getOrDefault(tasks[i],0)+1);
        }
        for (Character key : map.keySet()) 
        {
            pq.offer(key);
        }
        int time=0;
         while (!pq.isEmpty()) {
            List<Character> temp = new ArrayList<>();
            int used = 0;

            for (int i = 0; i <= n && !pq.isEmpty(); i++) {
                char c = pq.poll();
                used++;
                map.put(c, map.get(c) - 1);
                if (map.get(c) > 0) {
                    temp.add(c);
                }
            }

            for (char c : temp) {
                pq.offer(c);
            }

            time += pq.isEmpty() ? used : n + 1;
        }
        return time;
    }
}
