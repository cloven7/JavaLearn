package everyday.day14.tree;

import everyday.day8.superarray.SuperArray;

/**
 * @Description 层次遍历（队列（超级数组））
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/14 9:31
 * @Version 1.0
 */
public class LevelOrderQueue {

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

	public static void levelOrder(Nodes nodes){
		SuperArray<Nodes> superArray = new SuperArray();
		superArray.addToTail(nodes);
		while(superArray.getSize() > 0){
			Nodes select = (Nodes)superArray.select(0);
			System.out.println(select.value);
			superArray.delete(0);
			if(select.left != null)
				superArray.addToTail(select.left);
			if(select.right != null)
				superArray.addToTail(select.right);

		}


	}

	public static void main(String[] args) {

		Nodes nodesd = new Nodes(1);
		nodesd.left = new Nodes(2);
		nodesd.right = new Nodes(3);
		nodesd.left.left = new Nodes(4);
		nodesd.left.right = new Nodes(5);
		nodesd.right.left = new Nodes(6);
		nodesd.right.right = new Nodes(7);
		levelOrder(nodesd);

	}

}
