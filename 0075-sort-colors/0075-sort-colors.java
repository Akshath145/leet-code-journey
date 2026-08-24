class Solution {
    public void sortColors(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,0);
        map.put(1,0);
        map.put(2,0);
        for(int n:nums){
            map.put(n,1+map.get(n));
        }
        int idx=0;
        for(int colour=0;colour<3;colour++){
            int freq=map.get(colour);
            for(int j=0;j<freq;j++)
            {
                nums[idx]=colour;
                idx++;
            }
        }
        
    }
}