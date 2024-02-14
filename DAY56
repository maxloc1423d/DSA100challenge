class Solution {
    public int[] rearrangeArray(int[] nums) {
          int a=0, n = 1;
         int[] res = new int[nums.length];
        for ( int i = 0; i < res.length; i++) {
            if (nums[i] > 0) {
                res[a] = nums[i];
                a+=2;
            } else {
                res[n] = nums[i];
                n+=2;
            }

        }
        return res;
        
    }
}
