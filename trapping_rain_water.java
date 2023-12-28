class Solution {
    public int min(int a,int b)
    {
        if(a<=b)
        {
            return a;
        }
        else
        {
            return b;
        }
    }
    public int trap(int[] height)
    {
        int size=height.length;
        int left[]=new int[size];
        int right[]=new int[size];
        int max=-999;
        for(int i=0;i<size;i++)
        {
            if(max<=height[i])
            {
                max=height[i];
                left[i]=max;
                continue;
            }
            left[i]=max;
        }    
        max=-999;
        for(int i=(size-1);i>=0;i--)
        {
            if(max<=height[i])
            {
                max=height[i];
                right[i]=max;
                continue;
            }
            right[i]=max;
        }
        int sum=0;
        for(int i=0;i<size;i++)
        {
            sum=sum+(min(left[i],right[i])-height[i]);
        }
        return sum;
    }
}