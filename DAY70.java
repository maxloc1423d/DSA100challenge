class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        if(columnNumber < 27){
            return String.valueOf(alphabet.charAt(columnNumber-1));
        }
       
        while(columnNumber > 26){
            int temp = columnNumber%26;
            if (temp > 0){
                sb.append(alphabet.charAt(temp-1));
                columnNumber /= 26;
            }
            else{
                sb.append('Z');
                columnNumber /= 26;
                columnNumber -= 1;
            }

        }
        sb.append(alphabet.charAt(columnNumber-1));
       
        return String.valueOf(sb.reverse());
    }
}
