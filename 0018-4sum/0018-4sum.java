class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> list = new ArrayList<>();
         for(int i = 0; i < n;i++){
            if(i > 0 && nums[i]== nums[i-1])continue;

            int j = i+1;
            while(j < n){
                if(j > i+1 && nums[j] == nums[j-1]){
                    j++;
                    continue;
                }
                int left = j+1;
                int right = n-1;
                while(left < right){
                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];
                    if(sum == target){
                        List<Integer> result = new ArrayList<>();
                        result.add(nums[i]);
                        result.add(nums[j]);
                        result.add(nums[left]);
                        result.add(nums[right]);

                        list.add(result);

                        left++;
                        right--;

                        while(left < right && nums[left] == nums[left - 1]) left++;
                        while(left < right && nums[right] == nums[right + 1]) right--;
                    }else if(sum < target){
                        left++;
                    }else{
                        right--;
                    }
                }
                j++;
            }
        }
        return list;
    }
}

// class Solution {
//     public List<List<Integer>> fourSum(int[] nums, int target) {
//         List<List<Integer>> ls = new ArrayList<>();
//         int n = nums.length;

//         Arrays.sort(nums);

//         for (int i = 0; i < n; i++) {

//             if (i > 0 && nums[i] == nums[i - 1]) continue;

//             int j = i + 1;

//             while (j < n) {

//                 if (j > i + 1 && nums[j] == nums[j - 1]) {
//                     j++;
//                     continue;
//                 }

//                 int k = j + 1;
//                 int l = n - 1;

//                 while (k < l) {

//                     long sum = (long) nums[i] + nums[j] + nums[k] + nums[l];

//                     if (sum == target) {

//                         List<Integer> result = new ArrayList<>();
//                         result.add(nums[i]);
//                         result.add(nums[j]);
//                         result.add(nums[k]);
//                         result.add(nums[l]);

//                         ls.add(result);

//                         k++;
//                         l--;

//                         while (k < l && nums[k] == nums[k - 1]) k++;
//                         while (k < l && nums[l] == nums[l + 1]) l--;

//                     } 
//                     else if (sum < target) {
//                         k++;
//                     } 
//                     else {
//                         l--;
//                     }
//                 }
//                 j++;
//             }
//         }
//         return ls;
//     }
// }