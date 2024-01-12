class Solution {
    public boolean isPalindrome(String s) {
           String cleanedString = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        // Check if the cleaned string is a palindrome
        int left = 0;
        int right = cleanedString.length() - 1;

        while (left < right) {
            if (cleanedString.charAt(left) != cleanedString.charAt(right)) {
                return false; // Not a palindrome
            }
            left++;
            right--;
        }

        return true; // It's a palindrome
        
    }
}
