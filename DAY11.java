class Solution {
    public int lengthOfLongestSubstring(String s) {
        int a=0;            //pointer a
        int b=0;                //pointer b
        int max=0;

         HashSet<Character>str =new HashSet();

          while(b < s.length()){
              if(!str.contains(s.charAt(b))){
                  str.add(s.charAt(b));
                  b++;
                  max=Math.max(str.size(),max);
              }
              else{
                  str.remove(s.charAt(a));
                  a++;
              }
          }
        return max;
    }
}
