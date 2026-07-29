class Solution {
    public int divide(int dividend, int divisor) {
        int a=2147483647;
        if(dividend==(-2147483648)&&divisor==(-1)){
            return a;
        }else if(dividend==(-2147483648)&&divisor==1){
            return dividend;
        }
        else{
        int quo=0;
        quo=dividend/divisor;
        return quo;
        }
    }
}
