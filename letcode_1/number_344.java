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
        //将字符串转换成字符数组
        char [] chars=s.toCharArray();
        
        //交换数组中字符的位置
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
        
        //将chars数组转换成字符串
        //注意如果用tostring函数是不行的，因为数组中的tostring 方法没有被重写，会返回[类型@哈希值]这个格式
        //基本类型是可以调用tostring方法的
        String ss=new String(chars);
        // String ss=String.valueOf(chars);效果一样
        return ss;
    }
} 