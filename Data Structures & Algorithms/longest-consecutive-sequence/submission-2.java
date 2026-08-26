class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int longest=0;
        for(int n : nums)
            set.add(n);
        for(int s :  set){
            int length=0;
            if(!set.contains(s-1)){
                length =1;
             while(set.contains(s+length)){
                length++;
            }
            longest=Math.max(length,longest);
            }
        }
        return longest;
    }
}
