class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap <Integer, Integer> map = new HashMap<>();
        for(int s : nums){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        return map.entrySet().stream()
        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
        .limit(k)
        .mapToInt(Map.Entry::getKey)
        .toArray();
    }
}
