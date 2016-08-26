package letcode_1;
import java.io.*;
import java.util.*;
public class number_338 {
    
    //主函数
    public static void main(String args[])
    {
        
        //键盘输入一个数
        InputStreamReader isr=null;
        BufferedReader buf=null;
        int num=0;
        try{
            isr=new InputStreamReader(System.in);
            buf=new BufferedReader(isr);
            num=Integer.parseInt(buf.readLine());
        }catch(Exception e)
        {
            e.printStackTrace();
        }finally{
            try {
				buf.close();
				isr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
        
        number_338 test=new number_338();
        int [] b=test.countBits(num);
        System.out.print("[");
        for(int m=0;m<=num-1;m++)
        {
             System.out.print(b[m]+",");
        }
       System.out.print(b[num]+"]");
    }
    
    //
    public int[] countBits(int num) {
        //定义一个数组来存储二进中1的个数
        int [] num_bit=new int[num+1];
        
        
        int count;
        num_bit[0]=0;
        for(int i=1;i<=num;i++)
        {
            count=0;
            int k=0;
            int tmp=i;
            //记每一个数化成2进制之后得到的1的个数，移动sizeof(int)*8次
            for(int j=1;j<=32;j++)
            {
                k=tmp>>1;
                //如果移位之后得到的数为0，说明之后肯定没有1了
                if(k==0)
                {
                   count++;
                    break;
                }
                else if(tmp==3)
                {
                	count=count+2;
                	break;
                }
                else if(tmp%k!=0)
                {
                    count++;
                }
                tmp=k;
            }
            
            //数组中将这次得到的count记录下来
            num_bit[i]=count;
           
        }
        
        //返回数组的引用
        
        return num_bit;
    }
}
