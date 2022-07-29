package P2数组模拟队列;

import java.util.Scanner;

/**
 * @Description P2数组模拟队列 一次性使用，没有复用的效果
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/29 18:26
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

	// 最大容量
	private int maxSize;
	// 队列头
	private int front;
	// 队列尾
	private int rear;
	// 存放数据
	private int[] arr;

	// 构造器
	public ArrayQueue(int maxSize){
		this.maxSize = maxSize;
		arr = new int[maxSize];
		front = -1; // 指向队列头部
		rear = -1; 	// 指向队列尾部
	}

	// 是否满
	public boolean isFull(){
		return rear == maxSize - 1;
	}

	// 是否空
	public boolean isEmpty(){
		return rear == front;
	}

	// 添加数据到队列
	public void addQueue(int n){
		if(isFull()){
			System.out.println("队列已满");
			return;
		}
		arr[++rear] = n;
	}

	// 获取队列的数据
	public int getQueue(){
		if(isEmpty()){
			System.out.println("没有数据");
			throw new RuntimeException("队列空，不能取数据");
		}
		return arr[++front];
	}

	// 显示队列的数据
	public void listQueue(){
		// 遍历
		if(isEmpty()){
			System.out.println("没有数据");
			return;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println("i = " + i);
		}
	}

	// 显示队列的头部
	public int headQueue(){
		if(isEmpty()){
			System.out.println("没有数据");
			throw new RuntimeException("队列空，不能取数据");
		}
		return arr[front + 1];
	}
}
