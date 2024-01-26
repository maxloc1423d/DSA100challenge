class Solution {
  public int findMin(int[] nums) {
    int big = 0;
    int end = nums.length - 1;

    while (big < end) {
      final int m = (big + end) / 2;
      if (nums[m] < nums[end])
        end = m;
      else
        big = m + 1;
    }

    return nums[big];
  }
}
