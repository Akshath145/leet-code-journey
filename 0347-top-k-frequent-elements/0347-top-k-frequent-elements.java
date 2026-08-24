class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,1+map.getOrDefault(num,0));
        }
        int [] ans=new int[k];
        for(int i=0;i<k;i++){
            int maxfreq=-1;
            int ele=-1;
            for(int key:map.keySet())
            {
                if(map.get(key)>maxfreq){
                    maxfreq=map.get(key);
                    ele=key;
                }
            }
            ans[i]=ele;
            map.put(ele,-1);

        }
        return ans;

        
    }
}