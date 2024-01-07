class Solution {
    public int lengthOfLastWord(String s) {
         s = s.trim(); //remove the first and last space in given string 

        // Find the last space in the string
        int lastSpaceIndex = s.lastIndexOf(' ');

        // Calculate the length of the last word
        if (lastSpaceIndex == -1) {
            return s.length(); // If no spaces found, return the entire length
        } else {
            return s.length() - lastSpaceIndex - 1; // Subtracting index to get word length
        }
        
    }
}
