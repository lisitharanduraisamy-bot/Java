class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int size = piles.length;
        int max=0;
        for(int i=0;i<size;i++){
            if(piles[i]>max){
                max=piles[i];
            }
        }
        int a=0;
        for(int i=1;i<=max;i++){
            int n=i;
            long sum=0;
            for(int j=0;j<size;j++){
                sum=sum+((piles[j]+(long)n-1)/n);
            }
            if(sum<=h){
                a=i;
                break;
            }
        }
        return a;
    }
}
