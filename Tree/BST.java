public class BST {

	static class Node {
		int data;
		Node left, right;

		public Node(int data) {
			this.data = data;
		}
	}

	public static Node insert(Node root, int val) {
		if (root == null) {
			root = new Node(val);
			return root;
			
//			return new Node(val);
		}

		if (root.data > val) {
			// left subtree
			root.left = insert(root.left, val);
		} else {
			// right subtree
			root.right = insert(root.right, val);
		}
		return root;
	}
	
	public static void iterativeInsert(Node root, int x) {
		
	}

	public static void inorder(Node root) {
		if (root == null) {
			return;
		}

		inorder(root.left);
		System.out.print(root.data + " ");
		inorder(root.right);

	}

	public static boolean search(Node root, int key) { // O(H) H->Height

		if (root == null) {
			return false;
		}

		// search in the left subtree
		if (root.data > key) {
			return search(root.left, key);
		} else if (root.data == key) {
			return true;
		}
		// search in right subtree
		else {
			return search(root.right, key);
		}
	}

	public static Node delete(Node root, int val) {
		if (root.data > val) {
			root.left = delete(root.left, val);
		} else if (root.data < val) {
			root.right = delete(root.right, val);
		} else {
			// root.data == val
			// case 1
			if (root.left == null && root.right == null) {
				return null;
			}

			// case 2
			if (root.left == null) {
				return root.right;
			} else if (root.right == null) {
				return root.left;
			}

			// case 3
			Node IS = inorderSuccesor(root.right);
			root.data = IS.data;
			root.right = delete(root.right, IS.data);
		}
		return root;
	}

	public static Node inorderSuccesor(Node root) {
		while (root.left != null) {
			root = root.left;
		}
		return root;
	}

	public static void main(String[] args) {
		int values[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
		Node root = null;

		for (int i = 0; i < values.length; i++) {
			root = insert(root, values[i]);
		}

		inorder(root);
		System.out.println();

		if (search(root, 7)) {
			System.out.println("Found");
		} else {
			System.out.println("Not Found");
		}

		delete(root, 5);
		inorder(root);
		System.out.println();

	}
}
