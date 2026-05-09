class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer>maxheap = new PriorityQueue<>(Collections.reverseOrder());

        for(int num : nums){
            maxheap.add(num);
        }

        for(int i = 1; i < k; i++){
            maxheap.poll();
        }

        return maxheap.peek();



        // Arrays.sort(nums);
        // return nums[nums.length - k];
    }
}
