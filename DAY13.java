class Solution {
    public int[] twoSum(int[] nums, int target) {
    Map<Integer,Integer> ab=new HashMap<>();
    for(int i =0;i<nums.length;i++){
        int temp=target-nums[i];
        if(ab.containsKey(temp)){
            return new int[]{ab.get(temp),i};
        }
        ab.put(nums[i],i);
    }
    throw new IllegalArgumentException("no match found !");
        
    }
}
