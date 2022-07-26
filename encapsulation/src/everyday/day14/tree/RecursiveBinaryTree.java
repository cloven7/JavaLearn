package everyday.day14.tree;

/**
 * @Description 先序，中序，后序遍历
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/14 8:21
 * @Version 1.0
 */
public class RecursiveBinaryTree {

	// 构造树
	public static class Node{
		public int value;
		public Node left;
		public Node right;


		public Node(Integer v){
			value = v;
		}
	}

	// 递归遍历
	private static void recursive(Node node){
		if(node == null){
			return;
		}
		System.out.println(node.value);
		recursive(node.left);
		recursive(node.right);

	}

	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);

		recursive(root);
	}



}
