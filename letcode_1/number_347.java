package letcode_1;

import java.util.*;
public class number_347 {
	public static void main(String[] args)
	{
		int [] nums={1,1,1,2,2,3};
		number_347 n=new number_347();
		List<Integer> ls=n.topKFrequent(nums, 2);
		for(int i=0;i<ls.size();i++)
		{
			System.out.println(ls.get(i));
		}
	}
    public List<Integer> topKFrequent(int[] nums, int k) {
        int len=nums.length;
        ArrayList<flags>  fg=new ArrayList<flags>();
        for(int i=0;i<len;i++)
        {
            fg.add(new flags());
        }
        //��fg��ֵ
        for(int i=0;i<fg.size();i++)
        {
            fg.get(i).flag=1;
            fg.get(i).index=i;
        }
        //ѭ����nums�е������ֵĴ������м���
        
        for(int i=0;i<len-1;i++)
        {
            if(fg.get(i).flag>1)
            {
                continue;
            }
            int count=1;
            for(int j=1;j<len;j++)
            {
                if(nums[i]==nums[j])
                {
                    count=count+1;
                    fg.get(j).flag=count;
                }
            }
        }
        
        //��fg�е�flag�Ӵ�С����
        Comparator comp = new comparatorlmpl();
        Collections.sort(fg,comp);
        
        //��K��Ԫ��ֵ����res��
         ArrayList<Integer> res=new ArrayList<Integer>();
        for(int g=0;g<k;g++)
        {
            res.add(nums[fg.get(g).index]);
        }
     
        return res;
        
    }
}

//дһ���Ƚ�����
class comparatorlmpl implements Comparator<flags>
{
    public int compare(flags fg1,flags fg2)
    {
        int f1=fg1.flag;
        int f2=fg2.flag;
        if(f1>f2)
        {
            return 1;
        }
        else if(f1<f2)
        {
            return -1;
        }else
        {
            return 0;
        }
    }
}
        
        
//дһ��flags��
class flags
{
    int flag;
    int index;
    public flags()
    {
        flag=1;
        index=0;
    }
}
