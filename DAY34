class Solution {
    public int[] searchRange(int[] nums, int target) {

          int[] result = {-1, -1};

        // Find the starting position
        result[0] = findPosition(nums, target, true);

        // Find the ending position
        result[1] = findPosition(nums, target, false);

        return result;
    }

    private static int findPosition(int[] nums, int target, boolean isFirst) {
        int left = 0, right = nums.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                result = mid;

                // Adjust the search space based on whether we are looking for the first or last occurrence
                if (isFirst) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
        
    }
}
