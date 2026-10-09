class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int[] row : matrix) 
        {
                for (int val : row) 
                {
                    minHeap.offer(val);
                }
        }
        for(int i=0;i<k-1;i++)
        {
            minHeap.poll();
        }
            return  minHeap.poll();
    }
}
