package com.kexin.stack;

/**
 * 数组实现栈
 * 
 * @author lenovo
 *
 */
public class Stack4 {

	// 栈的大小
	private int stackLength;
	// 定义栈
	private int[] numberArray;
	// 栈顶
	private int top = -1;

	/**
	 * 为数组赋值大小
	 * 
	 * @param max
	 *            数组的长度
	 */
	public void numberArrayLength(int max) {
		this.stackLength = max;
		numberArray = new int[max];
	}

	/**
	 * 入栈
	 * 
	 * @param number
	 *            入栈的参数
	 */
	public void push(int number) {
		if (isFullStack()) {
			return;
		}
		numberArray[++top] = number;
	}

	/**
	 * 出栈：栈顶减1
	 * 
	 * @return
	 */
	public int outStack() {
		return numberArray[top--];
	}

	/**
	 * 查看栈中元素的个数
	 * 
	 * @return
	 */
	public int peek() {
		return numberArray[top];
	}

	/**
	 * 判断是否为满栈
	 * 
	 * @return
	 */
	public boolean isFullStack() {
		return top == (stackLength - 1);
	}

	/**
	 * 判断是否为空栈
	 * 
	 * @return
	 */
	public boolean isEmpty() {
		return top == -1;
	}

	/**
	 * 调用方法，传参数
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Stack4 stack = new Stack4();
		stack.numberArrayLength(5);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		System.out.println("查看栈：" + stack.peek());
		// 出栈
		while (!stack.isEmpty()) {
			System.out.println("出栈：" + stack.outStack());
		}
	}

}
