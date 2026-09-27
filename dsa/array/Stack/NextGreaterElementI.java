class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] ans = new int[n1];
        Stack<Integer> st = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n2; i++) {
            while (!st.isEmpty() && nums2[i] > st.peek()) {

                map.put(st.peek(), nums2[i]);
                st.pop();

            }
            st.push(nums2[i]);
        }
        for (int i = 0; i < n1; i++) {
            if (map.containsKey(nums1[i])) {
                ans[i] = map.get(nums1[i]);
            } else {
                ans[i] = -1;
            }
        }
        return ans;
    }
}
