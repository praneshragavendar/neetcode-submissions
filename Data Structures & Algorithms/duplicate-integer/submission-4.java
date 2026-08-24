class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
        int i =0;
        while(i<nums.length){
            if(i+1<nums.length&&nums[i]==nums[i+1]){
                return true;
            }
            i++;
        }
        return false;
    }
}