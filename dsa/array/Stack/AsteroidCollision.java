class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        int n = asteroids.length;
        outer:
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty()&&asteroids[i] < 0 && st.peek() > 0) {
                int x = Math.abs(asteroids[i]);
                if (x == Math.abs(st.peek())) {
                    st.pop();
                    continue outer;
                } else if (x > Math.abs(st.peek())) {
                    st.pop();
                } else {
                    continue outer;
                }
            }
            if (st.isEmpty() ||asteroids[i] > 0 && st.peek() < 0||asteroids[i] > 0 && st.peek() > 0||asteroids[i] < 0 && st.peek() < 0)
            {
                st.push(asteroids[i]);
            }

        }
        int[] ans = new int[st.size()];
        int n1=st.size()-1;
        while(!st.isEmpty())
            {
                 ans[n1]=st.pop();
                 n1--;
            }
        return ans;
    }
}
