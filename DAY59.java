class Solution {
    public int addDigits(int num) {
        int sum=0;
        while(num !=0){
            int last=num%10;
            num=num/10;
             sum +=last;

        }
        int sum2=0;
         while(sum !=0){
            int last=sum%10;
            sum=sum/10;
             sum2 +=last;

        }
        return sum2;
    }
}
