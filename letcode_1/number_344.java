package letcode_1;

import java.io.*;

public class number_344 {
    public static void main(String args[])
    {   
        String s="";
        try{
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader buf=new BufferedReader(isr);
        s=buf.readLine();
       }catch(Exception e)
       {
           e.printStackTrace();
       }
        number_344 slu=new number_344();
        String s1=slu.reverseString(s);
        System.out.println(s1);
        
    }
    public String reverseString(String s) {
        //���ַ���ת�����ַ�����
        char [] chars=s.toCharArray();
        
        //�����������ַ���λ��
        int low=0;
        int high=chars.length-1;
        while(low<high)
        {
             char t=chars[low];
             chars[low]=chars[high];
             chars[high]=t;
             low++;
             high--;
        }
        
        //��chars����ת�����ַ���
        //ע�������tostring�����ǲ��еģ���Ϊ�����е�tostring ����û�б���д���᷵��[����@��ϣֵ]�����ʽ
        //���������ǿ��Ե���tostring������
        String ss=new String(chars);
        // String ss=String.valueOf(chars);Ч��һ��
        return ss;
    }
} 