import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums)
    {
    int n = nums.length;
    Arrays.sort(nums);
    List<List<Integer>> result = new ArrayList<>();
    
    for(int i = 0; i < n-2; i++) {
        if(i > 0 && nums[i] == nums[i-1]) continue;
        int p = i+1;   
        int q = n-1;   
        while(p < q) {
            int sum = nums[i] + nums[p] + nums[q];
            if(sum > 0) q--;
            else if(sum < 0) p++;
            else {
                result.add(Arrays.asList(nums[i], nums[p], nums[q]));
                p++;
                q--;
                while(p < q && nums[p] == nums[p-1]) p++;
                while(p < q && nums[q] == nums[q+1]) q--;
            }
        }
    }
    return result; 
}
}
