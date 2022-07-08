package everyday.day8.superarray;



/**
 * @Description
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/8 18:25
 * @Version 1.0
 */
public class SuperLink<T> implements Super<T>{


	// 链表的头部
	private Node head;
	// 链表长度
	private int currentIndex = -1;

	// 对数据的增删改查
	// 增加一个元素
	public void add(T data){
		if(head == null){
			head = new Node(data, null);
		}else{
			// 创建一个指向头部的Node
			Node node = new Node(data, head);
			// 新的Node变成头部
			head = node;
		}
		currentIndex++;
	}

	// 删除下标的元素
	public void delete(int index){
		if(index < 0 || index > currentIndex)
			return;
		if(index == 0){
			head = head.getNext();
		} else {
			// 找到下标为index - 1的节点
			Node node = selectNode(index - 1);
			// 删除的核心
			node.setNext(node.getNext().getNext());
		}

		currentIndex--;
	}

	@Override
	public void set(int index, T data) {

	}

	// 修改下标的元素
	public void set(int index, int data){
		// 找到下标为index的节点(并修改)
		selectNode(index).setData(data);
	}

	// 查找数据（返回数据值）
	public T select(int index){
		// 找到下标为index的节点
		return (T) selectNode(index).getData();
	}

	// 查找数据（返回节点）//抽理出共有的方法
	private Node selectNode(int index){
		// 找到下标为index的节点
		Node node = head;
		for(int i = 0; i < index; i++){
			node = node.getNext();
		}
		return node;
	}

	// 获取长度
	public int getSize(){
		return currentIndex + 1;
	}

	// 把链表变成字符串
	public String arrayToString(){
		String res = "[";
		for(int i = 0; i <= currentIndex; i++){
			res += select(i).toString() + ",";
		}
		res = res.substring(0, res.length() - 1) + "]";
		return res;
	}

	// 向下标index增加数据data
	public void insert(int index, T data){
		if(index < 0 || index > currentIndex + 1)
			return;

		if(head == null){
			head = new Node(data, null);
		}
		else if(index == 0){
			// 创建一个指向头部的Node
			Node node = new Node(data, head);
			// 新的Node变成头部
			head = node;
		} else {
			// 找到index - 1的节点
			Node node = selectNode(index - 1);
                   /* head;
            for(int i = 0; i < index - 1; i++)
                node = node.getNext();*/

			// 插入新节点
			Node newNode = new Node(data, null);
			newNode.setNext(node.getNext());
			node.setNext(newNode);
		}

		currentIndex++;
	}

	// 头插
	public void addToHeader(T data) {
		this.insert(0, data);
	}

	// 尾插
	public void addToTail(T data){
		this.insert(currentIndex + 1, data);
	}

	@Override
	public void add(int index, T data) {

	}

}
