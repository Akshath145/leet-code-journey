class LRUCache {
    int cap;
    int size=0;

    int[] key;
    int[] value;

    public LRUCache(int capacity) {
        cap=capacity;

        key =new int[cap];
        value=new int[cap];
        
    }
    
    public int get(int k) {
        for(int i=0;i<size;i++)
        {
            if(key[i]==k)
            {
                int val=value[i];
                int tempKey=key[i];
                int tempVal=value[i];

                for(int j=i;j<size-1;j++)
                {
                    key[j]=key[j+1];
                    value[j]=value[j+1];
                }
                key[size-1]=tempKey;
                value[size-1]=tempVal;

                return val;
            }

        }
        return -1;
        
    }
    
    public void put(int k, int v) {

        for(int i=0;i<size;i++)
        {
            if(key[i]==k)
            {
                value[i]=v;
                get(k);
                return;
            }
        }
        
        if(size<cap)
        {
            key[size]=k;
            value[size]=v;

            size++;
        }
        else
        {
            for(int l=0;l<cap-1;l++)
            {
                key[l]=key[l+1];
                value[l]=value[l+1];
            }
            key[cap-1]=k;
            value[cap-1]=v;
        }
        
    }
}