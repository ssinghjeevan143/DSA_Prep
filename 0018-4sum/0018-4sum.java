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

