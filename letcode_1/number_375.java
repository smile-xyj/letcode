package letcode_1;
import java.io.*;
public class number_375 {
	

	    
	    //主函数
	    public static void main(String args[])
	    {
	    	number_375 s=new number_375(8);
	    	s.getMoneyAmount(10);
	    }
	    
	    //设定最终答案
	    int answer;
	    
	    //构造函数
	    public number_375(int answer)
	    {
	        this.answer=answer;
	    }
	    
	    
	    //猜测的方法
	    public int getMoneyAmount(int n) {
	        System.out.println("n= "+n+", I pick "+answer+".");
	        
	        int pay=0;
	        
	        int [] guess={0,0,0,0};//存放每次guess的数
	        for(int i=1;i<=3;i++)
	        {
	            //从键盘输入你想猜的数字
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
	                 //当猜测值小于标准值时提示标准值更高
	                 //判断是第几次并输出相应的提示语句
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
	                 //当标准值小于猜测时提示标准值更低
	                 //判断是第几次并输出相应的提示语句
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
	        
	        System.out.println("");//空一行
            System.out.println("Game over. "+answer+" is the number I picked.\r\n");
            System.out.println("You end up paying $"+guess[1]+"+ $"+guess[2]+"+ $"+guess[3]+"="+" $"+pay+".");
	        
	        return 0;
	         
	    }
	}

