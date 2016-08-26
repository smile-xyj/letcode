package letcode_1;

import java.util.*;
public class Solution {
	public static void main(String args[])
	{
        int nums[]={-1,3,4,5,4,3,-1,-1};
		Solution s=new Solution();
		int res=s.singleNumber(nums);
		System.out.println(res);
	}
    public int singleNumber(int[] nums) {
        if(nums.length==1)
        {
            return nums[0];
        }
        ArrayList al=new ArrayList();
        for(int n=0;n<nums.length;n++)
        {
            al.add(nums[n]);
        }
        Collections.sort(al);
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i==0)
            {
                if(al.get(i)!=al.get(i+1))
                {
                    count=i;
                    break;
                }
            }
            else if(i==nums.length-1)
            {
                if(al.get(i)!=al.get(i-1))
                {
                      count=i;
                       break;
                }
              
            }
            else
            {
                if(al.get(i)!=al.get(i-1)&&al.get(i)!=al.get(i+1))
                {
                    count=i;
                    break;
                }
                
            }
        }
        return (int)al.get(count);
    }
}