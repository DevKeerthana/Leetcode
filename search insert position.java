//search insert position
class Solution {
    public static int binary_search(int arr[],int start,int end,int target)
    {
        if(start<end)
        {
            int mid=(start+end)/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            else if(target<arr[mid])
            {
                binary_search(arr,start,mid-1,target);
            }
            else
            {
                binary_search(arr,mid+1,end,target);
            }
        }
        return -1;
    }
    public int searchInsert(int[] nums, int target) 
    {
        if(binary_search(nums,0,nums.length,target)==-1)
        {
            if(target<=nums[0])
                return 0;
            for(int i=0;i<nums.length-1;i++)
            {
                if(target>=nums[i] && target<=nums[i+1])
                {
                    return i+1;
                }
            }
            return nums.length;
        }
        return binary_search(nums,0,nums.length,target);     
    }
}