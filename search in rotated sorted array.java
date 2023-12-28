//search in rotated sorted array
class Solution {
    public static int search(int nums[],int start,int end,int target)
    {
        for(int i=start;i<=end;i++)
        {
            if(target==nums[i])
            {
                return i;
            }
        }
        return -1;
    }
    public int search(int[] nums, int target) 
    {
        int i=0;
        while(i<nums.length-1 && nums[i]<nums[i+1])
        {
            i=i+1;
        }    
        if(target<nums[0])
        {
            return search(nums,i+1,nums.length-1,target);
        }
        else
        {
            return search(nums,0,i,target);
        }
    }
}