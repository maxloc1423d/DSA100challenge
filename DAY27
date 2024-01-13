class Solution {
    public int removeDuplicates(int[] nums) {
       if (nums == null || nums.length == 0) {
            return 0;
        }

        int uniqueCount = 1; // Initialize count for the first unique element

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i -1]) {
                // Found a new unique element 
                nums[uniqueCount] = nums[i];
                uniqueCount++;
            }
        }

        return uniqueCount;
    }
}
