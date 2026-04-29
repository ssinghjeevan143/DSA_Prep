class Solution {
    public int romanToInt(String s) {
        int[]values={1000,900,500,400,100,90,50,40,10,9,5,4,3,2,1};
        Map<Character, Integer>map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int total = 0;
        for(int i = 0; i< s.length();i++){
            int value = map.get(s.charAt(i));
             if (i + 1 < s.length() && value < map.get(s.charAt(i + 1))) {
                total -= value; 
            } else {
                total += value;  
            }
        }
        return total;
    }
}