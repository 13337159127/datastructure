package com.kexin.queuearray;

/**
 * 数组实现队列
 * @author lenovo
 *
 */
public class Queue {

	// 定义数组
	private int[] numberArray;
	// 队头
	private int front;
	// 队尾
	private int rear;

	/**
	 * 数组的长度
	 * 
	 * @param size
	 */
	public void numberArrayLength(int size) {
		// 数组长度
		this.numberArray = new int[size];
		// 队头为0
		this.front = 0;
		// 队尾为-1
		this.rear = -1;
	}

	/**
	 * 判断队列是否为空
	 * 
	 * @return
	 */
	public boolean isEmpty() {
		// 如果队头等于数组的长度，返回true，为空队列
		return front == numberArray.length;
	}

	/**
	 * 判断队列是否为满
	 * 
	 * @return
	 */
	public boolean isFull() {
		// 如果队尾等于数组下标最大值，则为满队列，返回true
		return numberArray.length - 1 == rear;
	}

	/**
	 * 向队列队尾添加一个元素
	 * 
	 * @param number
	 */
	public int insert(int number) {
		// 如果为空，直接返回
		if (isFull()) {
			return rear + 1;
		}
		// 如果不为空，向队尾添加元素
		numberArray[++rear] = number;
		return rear;
	}

	/**
	 * 获得队头元素
	 * 
	 * @return
	 */
	public int peekFront() {
		return numberArray[front];
	}

	/**
	 * 获得队尾元素
	 * 
	 * @return
	 */
	public int peekRear() {
		return numberArray[rear];
	}

	/**
	 * 从队列的队头删除元素
	 * 
	 * @return
	 */
	public int remove() {
		return numberArray[front++];
	}

	/**
	 * 调用方法，传参数
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Queue queue = new Queue();
		// 数组的长度
		int numberLength = 3;
		queue.numberArrayLength(numberLength);
		// 向队列添加元素
		for (int i = 1; i < 5; i++) {
			int returnTab = queue.insert(i);
			// 如果返回数组下标小于数组的最大长度，入队成功
			if (returnTab < numberLength) {
				System.out.println(i + ":入队成功");
			} else {
				System.out.println(i + ":队列满了，入队失败");
			}
		}
		System.out.println("队头元素：" + queue.peekFront());
		System.out.println("队尾元素：" + queue.peekRear());
		// 出队：是否为空队列
		while (!queue.isEmpty()) {
			System.out.println(queue.remove() + ":出队了");
		}
	}

}
