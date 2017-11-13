/*

First Common Ancestor: Design an algorithm and write code to find the first 
common ancestor of two nodes in a binary tree. Avoid storing additional nodes 
in a data structure. NOTE: This is not necessarily a binary search tree.

 */
package cci_chap4_firstcommonancestor;

import bst.BST;
import bst.Node;

/**
 *
 * @author Ali
 */
public class CCI_Chap4_FirstCommonAncestor 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Node root = null;
        BST binaryTree = new BST();
        
        Node n1 = new Node(15);
        Node n2 = new Node(18);
        Node n3 = new Node(9);
        Node n4 = new Node(12);
        Node n5 = new Node(17);
        Node n6 = new Node(25);
        Node n7 = new Node(4);
        Node n8 = new Node(28);
        
        root = binaryTree.insertNode(n1, root);
        root = binaryTree.insertNode(n2, root);
        root = binaryTree.insertNode(n3, root);
        root = binaryTree.insertNode(n4, root);
        root = binaryTree.insertNode(n5, root);
        root = binaryTree.insertNode(n6, root);
        root = binaryTree.insertNode(n7, root);
        root = binaryTree.insertNode(n8, root);
        
        Node ancestor = binaryTree.leastCommonAncestor(n8, n5, root);
        System.out.println(ancestor.data);
    }
    
}
