class Solution {
    public boolean hasDuplicate(int[] nums) {
        int i = 0 , j=1 ;
        Arrays.sort(nums);
        while(j<nums.length){
            if(nums[j]!=nums[i]){
                j++;
                i++;
            }
            else{
                System.out.println("true");
                return true ;
            }
        }
        return false ;
    }
}