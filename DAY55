class abc {
    public static boolean revers(String str) {
        char[] str1 = str.toCharArray();
        int start = 0;
        int end = str1.length - 1;
        while (start < end) {
            char ab = str1[start];
            str1[start] = str1[end];
            str1[end] = ab;
            start++;
            end--;

        }
        return new String(str1).equals(str);
    }

    public static void main(String[] args) {
        String str = "ababa";
        System.out.println(revers(str));

    }
}
