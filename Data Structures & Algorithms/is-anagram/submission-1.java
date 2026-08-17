class Solution {
    public boolean isAnagram(String s, String t) {
        int sL = s.length();
        int tL = t.length();
        if(sL!=tL)
            return false;
        int sarr[]=new int[sL];
        int tarr[]=new int[tL];
        for(int i=0 ; i<sL ; i++){
            sarr[i]=s.charAt(i);
            tarr[i]=t.charAt(i);
        }
        Arrays.sort(sarr);
        Arrays.sort(tarr);
        for(int j =0 ; j<sL;j++){
            if(sarr[j]!=tarr[j]){
                return false;
            }
        }
        return true;
    }
}
