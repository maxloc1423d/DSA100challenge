class Solution {
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public void rotate(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k % nums.length == 0) {
            return;
        }

        int n = nums.length;
        k = k % n;
        // 1,2,3,4,5,6,7
        reverse(nums, 0, n-1);
        // 7,6,5,4,3,2,1
        reverse(nums, 0, k-1);
        // 5,6,7,4,3,2,1
        reverse(nums, k, n-1);
        // 5,6,7,1,2,3,4
    }
}
