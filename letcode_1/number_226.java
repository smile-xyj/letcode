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
 * 思路：1.层次遍历二叉树，遍历到有左右孩子中至少一个就进行孩子交换。
 *       2.先序遍历，当左右子树都完成各自整个子树的交换后，再进行左右子树的交换。
 * 
 */
 import java.util.*;
 import java.io.*;
 
public class number_226 {
    
       static int[] numbers={4,2,7,1,3,6,9};
     //主函数
     public static void main(String[] args)
     {
    	 number_226  s=new number_226 ();
         TreeNode root=new TreeNode(numbers[0]);
         s.createTree(root);
         System.out.println(root.right.right.val);
        root=s.invertTree(root);
//         System.out.println(root.val);        
     }
     
     //将一个数插入一棵二叉树
     public void insertTree(TreeNode root ,int data)
     {
         if(root==null)
         {
             root=new TreeNode(data);
         }
         else
         {
             //如果data小于root的话，插入到树的左边
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
             //插入右边子树
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
     
     //创建二叉树
     
     public void createTree(TreeNode root)
     {
         
         for(int i=1;i<numbers.length;i++)
         {
             this.insertTree(root,numbers[i]);
         }
     }
     
     //反转二叉树
    public TreeNode invertTree(TreeNode root) {
        
        
       //层次遍历，用到队列来实现
       if(root==null) return root;
       
       List<TreeNode> queue=new LinkedList<TreeNode>();//定义一个队列
       queue.add(root);//头节点入队
       while(!queue.isEmpty())
       {
    	    //将队头节点出队
            TreeNode tmp1=queue.remove(0);
            
             //交换左右子树
            TreeNode tmp=null;
            tmp=root.left;
            root.left=root.right;
            root.right=tmp;
            System.out.println(tmp1.val);
            //这里会出现一个空指向的运行时错误出现在tmp1上
            //左右节点入队
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


//节点类
    class TreeNode
    {
        int val;//节点的值
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
        TreeNode(){};
    }