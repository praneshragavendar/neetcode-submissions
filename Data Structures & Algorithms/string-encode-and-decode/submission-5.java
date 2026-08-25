class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String s : strs){
            sb.append(s.length());
            sb.append("#");
            sb.append(s);
        }
        String encode = sb.toString();    
        return encode;    
    }

    public List<String> decode(String str) {
        if(str.length()==0){
            return new ArrayList<>();
        }
        List<String> decode = new ArrayList<>();
        int i=0,j=0,length=0;
        while(i<str.length()){
            j=i;
            while(str.charAt(j)!='#'){
                j++;
            }
            length=Integer.parseInt(str.substring(i,j));
            decode.add(str.substring(j+1,j+1+length));
            i=j+1+length;
        }
        return decode;
    }
}
