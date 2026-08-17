class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int i = 0;
        while(i<=n-1){
            if ( i+1<n && nums[i]== nums[i+1]){
                return true;
            }
            i++;
        }
        
        return false;
    }
}