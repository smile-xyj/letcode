package letcode_1;
import java.io.*;
public class number_375 {
	

	    
	    //������
	    public static void main(String args[])
	    {
	    	number_375 s=new number_375(8);
	    	s.getMoneyAmount(10);
	    }
	    
	    //�趨���մ�
	    int answer;
	    
	    //���캯��
	    public number_375(int answer)
	    {
	        this.answer=answer;
	    }
	    
	    
	    //�²�ķ���
	    public int getMoneyAmount(int n) {
	        System.out.println("n= "+n+", I pick "+answer+".");
	        
	        int pay=0;
	        
	        int [] guess={0,0,0,0};//���ÿ��guess����
	        for(int i=1;i<=3;i++)
	        {
	            //�Ӽ�����������µ�����
	             InputStreamReader isr=new InputStreamReader(System.in);
	             BufferedReader bufr=new BufferedReader(isr);
	             String s;
	             int a=0;
	             
				try {
					s= bufr.readLine();
					a=Integer.parseInt(s);

				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally
				{
					try {
						isr.close();
						bufr.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

	             guess[i]=a;	             
	             if(guess[i]==answer)
	             {
	            	 guess[i]=0;
	                 
	                 break;
	             }
	             else if(guess[i]<answer)
	             {
	                 //���²�ֵС�ڱ�׼ֵʱ��ʾ��׼ֵ����
	                 //�ж��ǵڼ��β������Ӧ����ʾ���
	                 switch(i)
	                 {
	                  case 1:
	                      System.out.println("First round:  You guess "+guess[i]+", I tell you that it's higher. You pay $"+guess[i]);
	                      pay+=guess[i];
	                      break;
	                  case 2:
	                      System.out.println("Second round:  You guess "+guess[i]+", I tell you that it's higher. You pay $"+guess[i]);
	                      pay+=guess[i];
	                      break;
	                  case 3:
	                      System.out.println("Third round:  You guess "+guess[i]+", I tell you that it's higher. You pay $"+guess[i]);
	                      pay+=guess[i];
	                      break;
	                 }
	                 
	             }
	             else if(guess[i]>answer)
	             {
	                 //����׼ֵС�ڲ²�ʱ��ʾ��׼ֵ����
	                 //�ж��ǵڼ��β������Ӧ����ʾ���
	                 switch(i)
	                 {
	                  case 1:
	                      System.out.println("First round:  You guess "+guess[i]+", I tell you that it's lower. You pay $"+guess[i]);
	                      pay+=guess[i];
	                      break;
	                  case 2:
	                      System.out.println("Second round:  You guess "+guess[i]+", I tell you that it's lower. You pay $"+guess[i]);
	                      pay+=guess[i];
	                      break;
	                  case 3:
	                      System.out.println("Third round:  You guess "+guess[i]+", I tell you that it's lower. You pay $"+guess[i]);
	                      pay+=guess[i];
	                      break;
	                 }
	             }
	        }
	        
	        System.out.println("");//��һ��
            System.out.println("Game over. "+answer+" is the number I picked.\r\n");
            System.out.println("You end up paying $"+guess[1]+"+ $"+guess[2]+"+ $"+guess[3]+"="+" $"+pay+".");
	        
	        return 0;
	         
	    }
	}

