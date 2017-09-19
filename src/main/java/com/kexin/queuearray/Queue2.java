package com.kexin.queuearray;

/**
 * 数组实现队列
 * 
 * @author lenovo
 *
 */
public class Queue2 {

	// 定义一个数组
	private int[] numberArray;
	// 定义队尾
	private int rear;
	// 定义队头
	private int front;

	/**
	 * 为数组赋值
	 * 
	 * @param max
	 */
	public void numberArrayLength(int max) {
		this.numberArray = new int[max];
		this.front = 0;
		this.rear = -1;
	}

	/**
	 * 元素入队
	 * 
	 * @param number
	 */
	public int insert(int number) {
		// 如果队列为满，直接返回
		if (isFull()) {
			return rear + 1;
		}
		// 元素从队尾入队
		numberArray[++rear] = number;
		return rear;
	}

	/**
	 * 元素出队
	 * 
	 * @return
	 */
	public int remove() {
		// 元素从队头删除，先赋值，再加1
		return numberArray[front++];
	}

	/**
	 * 判断队列是否为空
	 * 
	 * @return
	 */
	public boolean isEmpty() {
		// 如果队头等于数组的长度,返回true
		return front == numberArray.length;
	}

	/**
	 * 判断队列是否为满
	 * 
	 * @return
	 */
	public boolean isFull() {
		// 如果队尾等于数组下标的最大值，队列为满
		return rear == numberArray.length - 1;
	}

	/**
	 * 队头元素
	 * 
	 * @return
	 */
	public int frontNumber() {
		return numberArray[front];
	}

	/**
	 * 队尾元素
	 * 
	 * @return
	 */
	public int rearNumber() {
		return numberArray[rear];
	}

	/**
	 * 调用方法，传参数
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Queue2 queue = new Queue2();
		// 定义数组的长度
		int size = 3;
		queue.numberArrayLength(size);
		// 入队
		for (int i = 1; i < 4; i++) {
			int returnTab = queue.insert(i);
			// 如果返回 的数组下标小于数组长度，则入队成功，如果等于或大于数组的长度，入队失败
			if (returnTab < size) {
				System.out.println(i + ":入队成功");
			} else {
				System.out.println(i + ":入队失败，队满了");
			}
		}
		System.out.println("队头元素为：" + queue.frontNumber());
		System.out.println("队尾元素为：" + queue.rearNumber());
		// 出队,如果队列不为空，元素出队
		while (!queue.isEmpty()) {
			System.out.println(queue.remove() + ":出队了");
		}
	}

}
