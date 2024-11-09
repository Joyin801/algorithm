package com.jo.algorithm.algorithm;

import com.jo.algorithm.leetcode.TreeNode;
import org.springframework.boot.jdbc.DataSourceUnwrapper;

/**
 * Date:2024/11/9
 * Author:Jo
 * Description:tree
 */
public class Tree {
    //先序遍历 中左右
    //中序遍历 左中右
    //后序遍历 左右中

//        1
//     2      3
//   4   5  6   7

    //先序遍历
    public static void preOrder(TreeNode head) {
        if (head == null) {
            return;
        }
        System.out.println(head.val);
        preOrder(head.left);
        preOrder(head.right);
    }

    //中序遍历
    public static void inOrder(TreeNode head) {
        if (head == null) {
            return;
        }
        inOrder(head.left);
        System.out.println(head.val);
        inOrder(head.right);
    }

    //后序遍历
    public static void posOrder(TreeNode head) {
        if (head == null) {
            return;
        }
        posOrder(head.left);
        posOrder(head.right);
        System.out.println(head.val);
    }

    public static void main(String[] args) {
        TreeNode head = new TreeNode(1);
        head.left = new TreeNode(2);
        head.right = new TreeNode(3);
        head.left.left = new TreeNode(4);
        head.left.right = new TreeNode(5);
        head.right.left = new TreeNode(6);
        head.right.right = new TreeNode(7);
        System.out.println("pre----------");
        preOrder(head);
        System.out.println("in-----------");
        inOrder(head);
        System.out.println("pos----------");
        posOrder(head);
    }
}
