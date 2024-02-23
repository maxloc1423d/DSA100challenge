class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> s1 = new HashSet<>();
        HashSet<Integer> s2 = new HashSet<>();

        for(int i : nums1)
        {
            s1.add(i);
        }
        for(int i : nums2){
            if(s1.contains(i)){

            s2.add(i);
            }
        }

        int[] result = new int[s2.size()];
        int i = 0;
        for(int n : s2)
        {
            result[i] = n;
            i++;
        }
        return result;
    }
}
