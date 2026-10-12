class Solution {
    public String reorganizeString(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        PriorityQueue<Character> pq = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
        int n = s.length();
        StringBuilder st = new StringBuilder();
        for (int i = 0; i < n; i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (Character key : map.keySet()) {
            pq.offer(key);
        }
        while (pq.size() > 1) {
            char a = pq.poll();
            char b = pq.poll();
            map.put(a, map.getOrDefault(a, 0) - 1);
            map.put(b, map.getOrDefault(b, 0) - 1);
            int freq1 = map.get(a);
            int freq2 = map.get(b);
            st.append(a);
            st.append(b);
            if (freq1 > 0 && freq2 > 0) {
                pq.offer(a);
                pq.offer(b);
            } else if (freq1 > 0) {
                pq.offer(a);
            } else if (freq2 > 0) {
                pq.offer(b);
            } else {
                continue;
            }
        }
            if (pq.size() == 1) {
                char a = pq.poll();
                if (map.get(a) > 1) {
                    return "";
                }
                st.append(a);
            }
        return st.toString();
    }
}
