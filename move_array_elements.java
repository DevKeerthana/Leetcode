import java.util.*;
import java.io.*;
//moving negative elements to the right of the array
static class move_array_elements {
    
    public static void segregateElements(int arr[], int n)
    {
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]<0)
            {
                count++;                
            }
        }
        int ni=n-count;
        for(int i=0;i<ni;i++)
        {
            if(arr[i]<0)
            {
                while(ni<n && arr[ni]<0)
                {
                    ni=ni+1;
                }
                int x=arr[ni];
                arr[ni]=arr[i];
                arr[i]=x;
                ni=ni+1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String args[])
    {
        int arr[]=new int[]{1,-1,3,2,-7,-5,11,6};
        segregateElements(arr,arr.length);

    }
}