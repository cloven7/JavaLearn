package everyday.day8.superarray;

/**
 * @Description
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/8 18:26
 * @Version 1.0
 */
public class Node<T> {

	private T data;
	private Node next;

	public Node(){

	}

	public Node(T data, Node next){
		this.data = data;
		this.next = next;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}


}
