class Solution {
    public int findDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<Integer>();
        for(Integer i:nums){
            if(!(set.add(i))){
                return i;
            }
        }
        return -1;
    }
}
