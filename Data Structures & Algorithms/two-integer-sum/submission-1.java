//Brute Force Solution

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] sum_pair = new int[2];
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if(i == j){
                    continue;
                }
                if((nums[i] + nums[j]) == target){
                    if(i < j){
                        sum_pair[0] = i;
                        sum_pair[1] = j;
                    }
                    else {
                        sum_pair[0] = j;
                        sum_pair[1] = i;
                    }
                }
            }
        }
        return sum_pair;
    }
}
