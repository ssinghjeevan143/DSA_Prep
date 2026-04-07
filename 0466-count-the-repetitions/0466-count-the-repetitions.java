class Solution {
    public int getMaxRepetitions(String s1, int n1, String s2, int n2) {
        int index = 0;
        int count = 0;

        Map<Integer,int[]>map = new HashMap<>();
        for(int i = 0; i < n1; i++){
            for(int j = 0; j < s1.length();j++){
                if(s1.charAt(j)== s2.charAt(index)){
                    index++;
                }

                if(index == s2.length()){
                    count++;
                    index = 0;
                }
            }
             if(map.containsKey(index)){
                int[]prev = map.get(index);
                int prev_i = prev[0];
                int prev_count = prev[1];
             int cycle_len = i - prev_i;
                int cycle_count = count - prev_count;

                int remaining = (n1 - i - 1) / cycle_len;

                count += remaining * cycle_count;
                i += remaining * cycle_len;
            } else {
                map.put(index, new int[]{i, count});
            }
        }

        return count / n2;
        
    }
}