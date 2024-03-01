// class Solution {
//     public char findTheDifference(String s, String t) {
//         char[] last=t.toCharArray();
//         char[] last1=s.toCharArray();
//         return last[last1.length];
        
//     }
// }
class Solution {
    public char findTheDifference(String s, String t) {
        char c = 0;
        for(char cs : s.toCharArray()) c ^= cs;
        for(char ct : t.toCharArray()) c ^= ct;
        return c;
    }
}
