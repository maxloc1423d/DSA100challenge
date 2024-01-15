class Solution {
    public String reverseWords(String s) {
         // Split the input string into an array of words
        String[] wordsArray = s.split("\\s+");
        
        // Convert the array to an ArrayList for easy manipulation
        ArrayList<String> wordsList = new ArrayList<>(Arrays.asList(wordsArray));
        
        // Create a new ArrayList to store the reversed words
        ArrayList<String> reversedWordsList = new ArrayList<>();
        
        // Reverse the words and add them to the new list
        for (int i = wordsList.size() - 1; i >= 0; i--) {
            reversedWordsList.add(wordsList.get(i));
        }
        
        // Build the result string by appending reversed words with spaces
        StringBuilder resultBuilder = new StringBuilder();
        for (String word : reversedWordsList) {
            resultBuilder.append(word).append(" ");
        }
        
        // Convert the result to a string and trim any trailing spaces
        String result = resultBuilder.toString().trim();
        
        return result;
    }
}
