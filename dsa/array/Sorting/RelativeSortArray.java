class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] ans = new int[n1];
        int count = 0;
        int k = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int j = 0; j < n1; j++) {
            map.put(arr1[j], map.getOrDefault(arr1[j], 0) + 1);
        }
        for (int i = 0; i < n2; i++) {
            count = 0;
            while (count < map.get(arr2[i])) {
                ans[k] = arr2[i];
                count++;
                k++;
            }
            map.remove(arr2[i]);

        }
        ArrayList<Integer> list = new ArrayList<>(map.keySet());

        Collections.sort(list);

        for (int x : list)

        {
            int c = map.get(x);

            while (c > 0) {
                ans[k] = x;
                k++;
                c--;
            }
        }
        return ans;
    }
}
