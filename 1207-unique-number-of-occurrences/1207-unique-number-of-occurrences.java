class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer>freqMap = new HashMap<>();
        for(int n : arr){
            freqMap.put(n,freqMap.getOrDefault(n,0)+1);
        }

        Set<Integer>set = new HashSet<>(freqMap.values());
    return freqMap.size() == set.size();
    }
}