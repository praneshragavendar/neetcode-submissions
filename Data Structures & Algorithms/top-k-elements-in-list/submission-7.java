class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap <Integer , Integer> map = new HashMap<>();
        for(int n: nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        List <Integer>[] freq = new List[nums.length+1];
        for(int i =0 ; i<nums.length+1;i++){
            freq[i]= new ArrayList<Integer>();
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            freq[entry.getValue()].add(entry.getKey());
        }
        int [] res = new int[k];
        int index = 0;
        for(int i=freq.length-1;i>0;i--){
            for(int n : freq[i]){
                res[index++]=n;
                if(index==k){
                    return res;
                }
            }
        }
        return res;
    }
}
