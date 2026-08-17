class Solution {
    public String minWindow(String s, String t) {
     if(t.isEmpty()==true) return "";
     HashMap<Character,Integer> countT = new HashMap<>();
     HashMap<Character,Integer> window = new HashMap<>();
     for(char c : t.toCharArray()){
        countT.put(c,countT.getOrDefault(c,0)+1);
     }
     int need=countT.size(),have=0;
     int res[] = {-1,-1};
     int resLen = Integer.MAX_VALUE;
     int l=0;
     for(int r=0;r<s.length();r++){
        char c = s.charAt(r);
        window.put(c,window.getOrDefault(c,0)+1);
        if(countT.containsKey(c)&&countT.get(c).equals(window.get(c))){
            have++;
        }
        while(have==need){
            if(r-l+1<resLen){
                res[0]=l;
                res[1]=r;
                resLen=r-l+1;
            }
             c=s.charAt(l);
            window.put(c,window.get(c)-1);
            if(countT.containsKey(c)&&window.get(c)<countT.get(c))
                have--;
            l++;
        }
     }
     return resLen==Integer.MAX_VALUE?"":s.substring(res[0],res[1]+1);
    }
}
