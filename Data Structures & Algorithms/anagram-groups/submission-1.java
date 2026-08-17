class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap <String , List<String>> map = new HashMap<>();
        String key;
        char[] keys;
        for(int i =0;i<strs.length;i++){
            keys = strs[i].toCharArray();
            Arrays.sort(keys);
            key = new String(keys);
            
            map.computeIfAbsent(key , k-> new ArrayList<String>()).add(strs[i]);
        }
         return new ArrayList<>(map.values());
    }
   
}
