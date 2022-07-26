package everyday.day14.tree;

import java.util.Stack;

/**
 * @Description 先序遍历（栈实现）
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/14 9:11
 * @Version 1.0
 */
public class PreOrderStack {

	// 构造树
	public static class Nodes{
		public Integer value;
		public Nodes left;
		public Nodes right;

		public Nodes(){

		}

		public Nodes(Integer v){
			value = v;
		}
	}

	// 栈实现先序遍历
	private static void pre(Nodes node){

		Stack<Nodes> stack = new Stack<>();
		stack.push(node);

		while(!stack.isEmpty()){
			node = stack.pop();
			System.out.println(node.value);
			if(node.right != null){
				stack.push(node.right);
			}
			if(node.left != null){
				stack.push(node.left);
			}


		}
	}

	public static void main(String[] args) {
		Nodes roots = new Nodes(1);
		roots.left = new Nodes(2);
		roots.right = new Nodes(3);
		roots.left.left = new Nodes(4);
		roots.left.right = new Nodes(5);
		roots.right.left = new Nodes(6);
		roots.right.right = new Nodes(7);

		pre(roots);
	}



}
