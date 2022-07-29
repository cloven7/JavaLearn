package P3数组模拟环形队列;

import java.util.Scanner;

/**
 * @Description
 * front 指向队列的第一个元素
 * rear 指向队列的最后一个元素的下一个位置（希望能判断为空）
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/29 19:08
 * @Version 1.0
 */
public class Main {

	public static void main(String[] args) {

		ArrayQueue arrayQueue = new ArrayQueue(3);
		Scanner scanner = new Scanner(System.in);
		while(true){
			System.out.println("1.显示数据 2.退出程序 3. 添加数据到队列 4.从队列中取出数据 5.队列头部数据");
			int type = scanner.nextInt();
			switch (type){
				case 1:
					arrayQueue.listQueue();
					break;
				case 2:
					scanner.close();
					System.exit(-1);
					break;
				case 3:
					System.out.println("请输入一个数：");
					int value = scanner.nextInt();
					arrayQueue.addQueue(value);
					break;
				case 4: // 取出数据
					try{
						System.out.println("arrayQueue.getQueue() = " + arrayQueue.getQueue());
					}catch (RuntimeException e){
						e.printStackTrace();
					}
					break;
				case 5:
					try{
						System.out.println("arrayQueue.headQueue() = " + arrayQueue.headQueue());
					}catch (RuntimeException e){
						e.printStackTrace();
					}
					break;
				default:
					break;
			}
		}
	}

}

class ArrayQueue{
	private int capacity;
	private int rear;
	private int front;
	private int[] arr;

	public ArrayQueue (int capacity){
		this.capacity = capacity;
		rear = 0;
		front = 0;
		arr = new int[capacity];
	}

	public ArrayQueue (){

	}

	public void addQueue(int value){
		if(isFull()){
//			throw new RuntimeException("队列满");
			System.out.println("队列已满");
			return;
		}
		//
		arr[rear] = value;
		rear = (rear + 1) % capacity;
	}

	public int getQueue(){
		if(isEmpty()){
			throw new RuntimeException("队列空");
		}
		//
		int value = arr[front];
		front = (front + 1) % capacity;
		return value;
	}

	public int headQueue(){
		if(isEmpty()){
			throw new RuntimeException("队列空~");
		}
		return arr[front];
	}

	public void listQueue(){
		if(isEmpty()){
			System.out.println("队列空");
		}
		// 从front开始遍历多少个元素
		for (int i = front; i < front + getSize(); i++) {
			System.out.print(arr[i % capacity] + " ");
		}
		System.out.println();

	}

	public int getSize(){
		return (rear + capacity - front) % capacity;
	}

	public boolean isEmpty(){
		return  rear == front;
	}

	public boolean isFull(){
		return (rear + 1) % capacity == front;
	}
}