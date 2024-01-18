import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class BinaryTree {
    TreeNode root;

    public BinaryTree() {
        this.root = null;
    }

    // Recursive function for inorder traversal
    public void inorderTraversal(TreeNode node) {
        if (node != null) {
            inorderTraversal(node.left);
            System.out.print(node.data + " ");
            inorderTraversal(node.right);
        }
    }

    // Recursive function for preorder traversal
    public void preorderTraversal(TreeNode node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preorderTraversal(node.left);
            preorderTraversal(node.right);
        }
    }

    // Recursive function for postorder traversal
    public void postorderTraversal(TreeNode node) {
        if (node != null) {
            postorderTraversal(node.left);
            postorderTraversal(node.right);
            System.out.print(node.data + " ");
        }
    }

    public int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(height(root.left), height(root.right)) + 1;
    }

    public void printNodeAtKDistance(TreeNode root, int k) {
        if (root == null) {
            return;
        }
        if (k == 0) {
            System.out.print(root.data + " ");
        } else {
            printNodeAtKDistance(root.left, k - 1);
            printNodeAtKDistance(root.right, k - 1);
        }
    }

    public void printLevelOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while (queue.isEmpty() == false) {
            TreeNode curr = queue.poll();
            System.out.print(curr.data + "");
            if (curr.left != null) {
                queue.add(curr.left);
            }
            if (curr.right != null) {
                queue.add(curr.right);
            }
        }
    }

    // size of binary tree
    public int getSize(TreeNode root){
        if(root == null){
            return 0;
        }else{
            return 1+getSize(root.left)+getSize(root.right);    
        }
    }

    public int getMax(TreeNode root){
        if(root == null){
            return Integer.MIN_VALUE;
        }
        else{
            return Math.max(root.data, Math.max(getMax(root.left), getMax(root.right)));
        }
    }

    public void printLeftView(TreeNode root){
        
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // Creating a sample binary tree
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);

        System.out.println("Inorder Traversal:");
        tree.inorderTraversal(tree.root);
        System.out.println();

        System.out.println("Preorder Traversal:");
        tree.preorderTraversal(tree.root);
        System.out.println();

        System.out.println("Postorder Traversal:");
        tree.postorderTraversal(tree.root);
        System.out.println();

        System.out.println("Height = " + tree.height(tree.root));

        int k = 2;
        System.out.println("Node at distance " + k);
        tree.printNodeAtKDistance(tree.root, k);

        System.out.println("\nBFS: ");
        tree.printLevelOrderTraversal(tree.root);
        
        System.out.println("\nSize of BST is: ");
        System.out.println(tree.getSize(tree.root));

        System.out.println("\nMax Node In Given Tree:");
        System.out.println(tree.getMax(tree.root));
    }
}
