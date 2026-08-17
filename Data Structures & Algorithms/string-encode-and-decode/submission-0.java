class Solution {

    public String encode(List<String> strs) {
        StringBuilder res = new StringBuilder();
        for(String s : strs){
            res.append(s.length()).append("#").append(s);
        }
        String result = res.toString();
        return result;
    }

    public List<String> decode(String str) {
        if(str.length()==0){
            return new ArrayList<>();
        }
        List<String> ans = new ArrayList<>();
        int i =0,j=0;
        while(i<str.length()){
            int length=0;
            j=i;
            while(str.charAt(j)!='#'){
                j++;
            }
            length=Integer.parseInt(str.substring(i,j));
            ans.add(str.substring(j+1,j+1+length));
            i=j+1+length;
        }
       return ans;
    }
}
