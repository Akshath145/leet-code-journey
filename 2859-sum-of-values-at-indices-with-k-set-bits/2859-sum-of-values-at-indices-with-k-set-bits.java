class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum=0;
        for(int i=0;i<nums.size();i++){
            int setbit=countsetbits(i);
            if(setbit==k)
                sum=sum+nums.get(i);
        }
        return sum;
    }
    int countsetbits(int n){
        int count=0;
        while(n>0){
            n=n&(n-1);
                count++;
        }
        return count;
}
}