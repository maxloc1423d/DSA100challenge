class Solution {
    public int reverse(int x) {
        int revers=0;
        int pop;
        while( x !=0){
            pop=x%10;
            x/=10;

             if(revers >Integer.MAX_VALUE/10 ||revers ==Integer.MAX_VALUE/10 && pop >7)
             { 
                 return 0;
             }
             if(revers <Integer.MIN_VALUE/10 ||revers ==Integer.MIN_VALUE/10 && pop <-8){
                 return 0;
             }
             revers =(revers *10)+pop;
        }
        return revers;
        
    }
}
