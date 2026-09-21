class Solution {

    //BRUTE FORCE APPROACH 
    //time limit exceeded error
    // public int totalFruit(int[] fruits) {
    //     int max = 0;
    //     for(int i = 0; i < fruits.length; i++){
    //         Set<Integer>set = new HashSet<>();
    //         for(int j = i; j < fruits.length; j++){
    //             set.add(fruits[j]);
    //             if(set.size() > 2){
    //                 break;
    //             }

    //             max = Math.max(max, j - i + 1);
    //         }
    //     }
    //     return max;
    // }


    public int totalFruit(int[] fruits) {
        int max = 0; 
        int i = 0;
        int j = 0;
        Map<Integer, Integer>map = new HashMap<>();
        while(j < fruits.length){
            map.put(fruits[j], map.getOrDefault(fruits[j], 0) + 1);

            while(map.size() > 2){
                map.put(fruits[i], map.get(fruits[i]) - 1 );
                if(map.get(fruits[i]) == 0){
                    map.remove(fruits[i]);
                }
                i++;
            }

             max = Math.max(max, j - i + 1);
             j++;

        }
        return max;

       
    }
}