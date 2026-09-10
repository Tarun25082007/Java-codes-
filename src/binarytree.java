import java.util.*;
public class binarytree {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;

        }
    }
    static class Binarytree {
        static int idx = -1;
        public static Node buildtree(int nodes[]){
            idx++;
            if (nodes[idx] == -1){
                return null;
            }
            Node newnode = new Node(nodes[idx]);
            newnode.left = buildtree(nodes);
            newnode.right = buildtree(nodes);
            return newnode;

        }

    }
    // this is outside because we just travers and no change and the whole thing
    // is contained by root not the binary tree
    public static void preordertraversal(Node root){
        if (root == null){
            return;
        }
        //root
        System.out.print(root.data + " ");
        //left
        preordertraversal(root.left);
        //right
        preordertraversal(root.right);
    }
    public static void inordertraversal(Node root){
        if (root == null){
            return;
        }
        inordertraversal(root.left);
        System.out.print(root.data + " ");
        inordertraversal(root.right);

    }
    public static void postordertraversal(Node root){
        if (root == null){
            return;
        }
        postordertraversal(root.left);
        postordertraversal(root.right);
        System.out.print(root.data + " ");

    }
    public static void levelordertraversal(Node root){
        if (root == null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()){
            Node curr = q.poll();
            if (curr == null){
                System.out.println();
                if (q.isEmpty()){
                    return;
                }else {
                    q.add(null);
                }
            }
            else {
                System.out.print(curr.data + " ");
                if (curr.left != null){q.add(curr.left);}
                if (curr.right != null){q.add(curr.right);}
            }
        }
    }

    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5,  -1, -1, 3, -1, 6,-1,-1};
        Binarytree tree = new Binarytree();
        Node root = tree.buildtree(nodes);
        System.out.println(root.data);
        preordertraversal(root);
        System.out.println();
        inordertraversal(root);
        System.out.println();
        postordertraversal(root);
        System.out.println();
        levelordertraversal(root);
    }
}
