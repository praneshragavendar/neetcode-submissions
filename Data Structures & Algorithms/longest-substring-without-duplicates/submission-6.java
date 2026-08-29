class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0,length=0;
        Set<Character> subString = new HashSet<>();
        for(int r=0;r<s.length();r++){
            while(subString.contains(s.charAt(r))){
                subString.remove(s.charAt(l));
                l++;
            }
            subString.add(s.charAt(r));
            length=Math.max(subString.size(),length);
        }
        return length;
    }
}
