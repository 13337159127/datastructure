package com.kexin.stack;

/**
 * 数组实现栈
 * 
 * @author lenovo
 *
 */
public class Stack {

	// 栈的长度
	private int stackLength;
	// 栈
	private int[] numberArray;
	// 栈顶的位置。栈顶等于-1，就是空栈
	private int top = -1;

	/**
	 * 定义数组的长度
	 * 
	 * @param max
	 *            数组的长度
	 */
	public void numberArrayLength(int max) {
		this.stackLength = max;
		numberArray = new int[max];
	}

	/**
	 * 入栈：向栈中添加元素
	 * 
	 * @param number
	 */
	public void push(int number) {
		if (isFullStack()) {
			return;
		}
		// 栈顶加1，把元素入栈
		numberArray[++top] = number;
	}

	/**
	 * 出栈：删除栈中的元素
	 * 
	 * @return
	 */
	public int pop() {
		// 栈顶减1，元素出栈
		return numberArray[top--];
	}

	/**
	 * 查看栈里面有几个元素
	 * 
	 * @return
	 */
	public int peek() {
		// 返回从0到栈顶的个数
		return numberArray[top];
	}

	/**
	 * 判断是否为满栈
	 * 
	 * @return
	 */
	public boolean isFullStack() {
		// 如果栈顶等于栈的最大容量，返回true
		return top == (stackLength - 1);
	}

	/**
	 * 判断是否为空栈
	 * 
	 * @return
	 */
	public boolean isEmpty() {
		// 栈顶的值是否为-1
		// 如果为-1，返回true，证明是空栈
		// 如果栈顶不为-1，返回false，证明不是空栈
		return top == -1;
	}

	/**
	 * 调用方法
	 * 
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		Stack stack = new Stack();
		stack.numberArrayLength(3);
		// 入栈
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		// 查看栈
		System.out.println("查看栈：" + stack.peek());
		// 出栈
		// 如果返回的栈顶不等于-1，说明不是空栈。可以进行出栈操作
		while (!stack.isEmpty()) {
			System.out.println("出栈" + stack.pop());
		}
	}
}
