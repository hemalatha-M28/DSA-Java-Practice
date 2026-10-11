class Solution {
    public String frequencySort(String s) 
    {
        int n = s.length();
        HashMap <Character,Integer> map = new HashMap<>();
        PriorityQueue <Character> pq=new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
        StringBuilder st=new StringBuilder();
        int count=1;
        for(int i=0;i<n;i++)
        {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for(Character key : map.keySet())
        {
            pq.offer(key);
        }
        while(!pq.isEmpty())
        {
            char a=pq.poll();
            int freq=map.get(a);
            do
            {
                st.append(a);
                count++;
            }while(freq>=count);
            count=1;
        }    
        return st.toString();
    }
}
