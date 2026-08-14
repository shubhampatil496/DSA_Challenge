import java.util.*;

class Node{
    int data;
    Node right;
    Node left;

    Node(int data){
        this.data = data;
        this.left = left;
        this.right = right;
    }
}

public class BinaryTree{
    // PREORDER TRAVERSAL
    public static void preorder(Node root){

        if(root == null){
            return;
        }

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    // INORDER TRAVERSAL
    public static void inorder(Node root){

        if(root == null){
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    // POSTORDER TRAVERSAL
    public static void postorder(Node root){

        if(root == null){
            return;
        }

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    public static void main(String[] args){
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);

        root.left.left = new Node(40);
        root.left.right = new Node(50);

        root.right.left = new Node(60);
        root.right.right = new Node(70);

        System.out.print("PREORDER : ");
        preorder(root);
        System.out.println();

        System.out.print("INORDER : ");
        inorder(root);
        System.out.println();

        System.out.print("POSTORDER : ");
        postorder(root);
    }
}