class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] indices = {0,0};
        for(int i = 0; i < nums.length; i++){
            for(int k = 0; k < nums.length; k++){
                if(i != k){
                    if (nums[i] + nums[k] == target) {
                        indices[0]=i;
                        indices[1]=k;
                    }
                }
            }
        }
        return indices;
    }
}
