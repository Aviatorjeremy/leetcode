public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ret={0,0};
        int n = nums.length;
        for(int i=0; i < n-1; i++){
            //if(nums[i-1] <= target)
            for(int j=i+1; j < n; j++){
                if(nums[i] + nums[j] == target){
                    ret[0] = i;
                    ret[1] = j;
                    return ret;
                }
            }
        }
        return ret;
    }
}