/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bst;
/**
 *
 * @author Ali
 */
public class BST 
{   
    public Node insertNode(Node node, Node root)
    {
        if(root == null)
        {
            root = node;
        }
        else if(node.data <= root.data)
            root.left = insertNode(node, root.left);
            
        else
            root.right = insertNode(node, root.right);
        
        return root;
    }
    
    public Node leastCommonAncestor(Node pNode, Node qNode, Node root)
    {
        if (root == null)
        {
            return null;
        }
        
        if (root == pNode || root == qNode)
        {
            return root;
        }
        
        Node left = leastCommonAncestor(pNode, qNode, root.left);
        Node right = leastCommonAncestor(pNode, qNode, root.right);
        
        if (left != null && right != null)
            return root;
        if (left == null && right == null)
            return null;
        
        return left != null ? left : right;
    }
}