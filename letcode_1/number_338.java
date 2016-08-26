package letcode_1;
import java.io.*;
import java.util.*;
public class number_338 {
    
    //������
    public static void main(String args[])
    {
        
        //��������һ����
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
        //����һ���������洢������1�ĸ���
        int [] num_bit=new int[num+1];
        
        
        int count;
        num_bit[0]=0;
        for(int i=1;i<=num;i++)
        {
            count=0;
            int k=0;
            int tmp=i;
            //��ÿһ��������2����֮��õ���1�ĸ������ƶ�sizeof(int)*8��
            for(int j=1;j<=32;j++)
            {
                k=tmp>>1;
                //�����λ֮��õ�����Ϊ0��˵��֮��϶�û��1��
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
            
            //�����н���εõ���count��¼����
            num_bit[i]=count;
           
        }
        
        //�������������
        
        return num_bit;
    }
}
