class Solution {
    public double myPow(double x, int n) {
        double a=1,b=1;
        if(n>0){
            for(int i=1;i<=n;i++){
                a=a*x;
            }
            return a;
        }else{
            for(int i=1;i<=(-(n));i++){
                b=b*x;
            }
            return 1/b;
        }
    }
}
