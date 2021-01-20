package com.upgrad.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Node{
    int data;
    Node left,right;
    public Node(int d){
        data=d;
        left=null;
        right=null;
    }
}
public class BFS {
    Node root;
    public BFS(){
        root=null;
    }
    int height(Node root){
        if(root== null){
            return 0;
        }else{
            int lheight=height(root.left);
            int rheight=height(root.right);
            if(lheight>rheight){
                return lheight+1;
            }else{
                return rheight+1;
            }
        }

    }
    void printNodeAtThisLevel(Node root,int level){
        if(root==null){
            return;
        }
        if (level==1){
            System.out.print(root.data+"  ");
        }else if (level>1){
            printNodeAtThisLevel(root.left,level-1);
            printNodeAtThisLevel(root.right,level-1);
        }
    }
    void levelOrderOrBFS(){
        int h=height(root);
        for(int i=1;i<=h;i++){
            printNodeAtThisLevel(root,i);
        }
    }
    void printBFSUsingQueue(){
        Queue<Node> q=new LinkedList<Node>();
        q.add(root);
        while(!q.isEmpty()){
            Node temp=q.poll();
            System.out.print(temp.data+"  ");
            if (temp.left!=null){
                q.add(temp.left);
            }
            if(temp.right!=null){
                q.add(temp.right);
            }
        }
    }
    void printSpiral(Node node)
    {
        if (node == null)
            return; // NULL check

        // Create two stacks to store alternate levels
        Stack<Node> rightToLeft = new Stack<Node>();
        Stack<Node> leftToRight = new Stack<Node>();

        // Push first level to first stack 's1'
        rightToLeft.push(node);

        // Keep printing while any of the stacks has some nodes
        while (!rightToLeft.empty() || !leftToRight.empty()) {
            // Print nodes of current level from rightToLeft and push nodes of
            // next level to leftToRight
            while (!rightToLeft.empty()) {
                Node temp = rightToLeft.peek();
                rightToLeft.pop();
                System.out.print(temp.data + " ");

                // Note that is right is pushed before left
                if (temp.right != null)
                    leftToRight.push(temp.right);

                if (temp.left != null)
                    leftToRight.push(temp.left);
            }

            // Print nodes of current level from leftToRight and push nodes of
            // next level to rightToLeft
            while (!leftToRight.empty()) {
                Node temp = leftToRight.peek();
                leftToRight.pop();
                System.out.print(temp.data + " ");

                // Note that is left is pushed before right
                if (temp.left != null)
                    rightToLeft.push(temp.left);
                if (temp.right != null)
                    rightToLeft.push(temp.right);
            }
        }
    }
    void mirrorTheTree(){
        if(root==null){
            return;
        }
        Queue<Node> q=new LinkedList<Node>();
        q.add(root);
        while(!q.isEmpty()){
            Node curr=q.poll();
            //swap
            Node temp=curr.left;
            curr.left=curr.right;
            curr.right=temp;
            if(curr.left!=null){
                q.add(curr.left);
            }
            if(curr.right!=null){
                q.add(curr.right);
            }
        }
    }
    void inorderUsingIteration()
    {
        if (root == null){
            return;
        }
        Stack<Node> s = new Stack<Node>();
        Node curr = root;

        // traverse the tree
        while (curr != null || s.size() > 0)
        {

            /* Reach the left most Node of the
            curr Node */
            while (curr !=  null)
            {
                /* place pointer to a tree node on
                   the stack before traversing
                  the node's left subtree */
                s.push(curr);
                curr = curr.left;
            }

            /* Current must be NULL at this point */
            curr = s.pop();

            System.out.print(curr.data + " ");

            /* we have visited the node and its
               left subtree.  Now, it's right
               subtree's turn */
            curr = curr.right;
        }
    }
    public static void main(String args[]){
        BFS tree=new BFS();
        tree.root=new Node(1);
        tree.root.left= new Node(2);
        tree.root.right=new Node(3);
        tree.root.right.left=new Node(4);
        tree.root.right.right=new Node(5);
        tree.levelOrderOrBFS();
//        System.out.println(" ");
//        tree.printBFSUsingQueue();
//        System.out.println(" ");
//        tree.printSpiral(tree.root);
//        tree.mirrorTheTree();
//        tree.printBFSUsingQueue();
//        System.out.println(" ");
//        tree.inorderUsingIteration();

    }
}
