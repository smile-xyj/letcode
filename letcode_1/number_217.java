package letcode_1;

import java.util.*;
public class number_217 {
	public static void main(String [] args)
	{
		int [] aa=new int[3000000];
		for(int i=0;i<aa.length;i++)
		{
			aa[i]=i+1;
		}
		double start = System.currentTimeMillis(); 
		number_217 s=new number_217();
		System.out.println(s.containsDuplicate(aa));
		double end = System.currentTimeMillis() ; 
		System.out.println("time is : " + (end - start)); 
	}
    public boolean containsDuplicate(int[] nums) {
        int len=nums.length;
        if(len==0)
        {
            return false;
        }
        if(len==1)
        {
            return false;
        }
        
        Set s=new HashSet();
        for(int i=0;i<len;i++)
        {
            s.add(nums[i]);
        }
        if(s.size()==len)
        {
            return false;
        }else
        {
            return true;
        }
      
    }
}