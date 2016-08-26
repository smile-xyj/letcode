package letcode_1;

/**
 /**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 *
 * ˼·��1.��α����������������������Һ���������һ���ͽ��к��ӽ�����
 *       2.�����������������������ɸ������������Ľ������ٽ������������Ľ�����
 * 
 */
 import java.util.*;
 import java.io.*;
 
public class number_226 {
    
       static int[] numbers={4,2,7,1,3,6,9};
     //������
     public static void main(String[] args)
     {
    	 number_226  s=new number_226 ();
         TreeNode root=new TreeNode(numbers[0]);
         s.createTree(root);
         System.out.println(root.right.right.val);
        root=s.invertTree(root);
//         System.out.println(root.val);        
     }
     
     //��һ��������һ�ö�����
     public void insertTree(TreeNode root ,int data)
     {
         if(root==null)
         {
             root=new TreeNode(data);
         }
         else
         {
             //���dataС��root�Ļ������뵽�������
             if(data<root.val)
             {
                if(root.left==null)
                {
                    root.left=new TreeNode(data);
                }
                else
                {
                    this.insertTree(root.left,data);
                }
             }
             //�����ұ�����
             else
             {
                 if(root.right==null)
                 {
                     root.right=new TreeNode(data);
                 }
                 else
                 {
                     this.insertTree(root.right,data);
                 }
             }
         }
     }
     
     //����������
     
     public void createTree(TreeNode root)
     {
         
         for(int i=1;i<numbers.length;i++)
         {
             this.insertTree(root,numbers[i]);
         }
     }
     
     //��ת������
    public TreeNode invertTree(TreeNode root) {
        
        
       //��α������õ�������ʵ��
       if(root==null) return root;
       
       List<TreeNode> queue=new LinkedList<TreeNode>();//����һ������
       queue.add(root);//ͷ�ڵ����
       while(!queue.isEmpty())
       {
    	    //����ͷ�ڵ����
            TreeNode tmp1=queue.remove(0);
            
             //������������
            TreeNode tmp=null;
            tmp=root.left;
            root.left=root.right;
            root.right=tmp;
            System.out.println(tmp1.val);
            //��������һ����ָ�������ʱ���������tmp1��
            //���ҽڵ����
            if(tmp1.left!=null)
            {
                queue.add(tmp1.left);
            }
            if(root.right!=null)
            {
                queue.add(tmp1.right);
            }
       }
       
       return root;
      
    }
}


//�ڵ���
    class TreeNode
    {
        int val;//�ڵ��ֵ
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
        TreeNode(){};
    }