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
    public static int count = 0;
    // this is outside because we just travers and no change and the whole thing
    // is contained by root not the binary tree
    public static void preordertraversal(Node root){
        if (root == null){
            return;
        }
        //root
        System.out.print(root.data + " ");
        //count
        count ++;
        //sum
        sum += root.data;
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
    // summ
    public static int sum = 0;
    public static void levelordertraversal(Node root){
        if (root == null){
            // non recursive only loops
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
    public static int heigth (Node root){
        if (root == null){
            return 0;
        }
        int lefth = heigth (root.left);
        int righth = heigth (root.right);
        return Math.max(lefth, righth) + 1;
        // the plus 1 is doing stuff and working not the othr stuuff
       // return lefth + righth + 1;(count)
        //return leflt + rigth  + root.val;(sum)
        // plus 1
        // same logic for sount and sum
    }
    public static int diaon2(Node root){
        if (root == null){
            return 0;
        }
        int left = diaon2(root.left);
        int right = diaon2(root.right);
        int all = heigth(root.left)  + heigth(root.right) + 1;
        return Math.max( all ,Math.max(left, right))  ;
    }
    // new tree to save data
    public static  class treeinfo{
        public int ht;
     public    int dia;
        treeinfo(int ht,int dia){
            this.ht=ht;
            this.dia=dia;
        }
    }
    // o(n) approach
public static treeinfo diaon(Node root){
        // to start tje cycle as usual from zero
        if (root == null){
          return new treeinfo(0,0);
        }
        treeinfo left=diaon(root.left);//to create left
        treeinfo right=diaon(root.right);
        int heigth = Math.max(left.ht,right.ht) + 1;//will increase the final thing
        int dia1 = left.dia;
        int dia2 = right.dia;
        int dia3 = left.ht + right.ht+1;
        int maxdia = Math.max(Math.max(dia1,dia2),dia3);
        treeinfo myinfo = new treeinfo(heigth,maxdia);
        return myinfo;
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
        System.out.println(count);
        System.out.println(sum);
        System.out.println(heigth(root));
        System.out.println(diaon2(root));
        System.out.println(diaon(root).dia);
    }
}
