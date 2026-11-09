class Solution {
    public boolean hasDuplicate(int[] nums) {

        if(nums.length == 0){
            return false;
        }

        HashMap<Integer, Boolean> map = new HashMap<>();
        map.put(nums[0], false);
        for(int i = 1; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                return true;
            }
            else{
                map.put(nums[i], false);
            }
        }
        return false;
    }
}