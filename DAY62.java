class Solution {
    public int maximumProduct(int[] nums) {
        // int pro=1;
        // for(int i=0;i<nums.length;i++){
        //     pro *=nums[i];

        // }
        // return pro;
         Arrays.sort(nums);
        int n = nums.length - 1;
        int a = nums[0] * nums[1] * nums[n];
        int b = nums[n] * nums[n - 1] * nums[n - 2];
        return Math.max(a, b);
        
    }
}
