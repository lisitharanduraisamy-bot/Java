class Solution {
    public long maxPairStrength(int[] nums) {
        long result=0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                long a = nums[i];
                long b = nums[j];
                while(a!=b){
                    if(a>b){
                        a=a-b;
                    }else{
                        b=b-a;
                    }
                }
                long ans=(nums[i]*nums[j])/(a*a);
                if(ans>result){
                    result=ans;
                }
            }
        }
        return result;
    }
}©leetcode
