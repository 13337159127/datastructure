package com.kexin.stack;

public class Stack2 {

	// 栈的长度
	private int length;

	// 定义一个栈
	private String[] nameArray;

	// 定义一个栈顶的值,等于-1为空栈
	private int top = -1;

	/**
	 * 定义栈的长度
	 * 
	 * @param max
	 *            栈的长度
	 */
	public void nameArrayLength(int max) {
		this.length = max;
		nameArray = new String[max];
	}

	/**
	 * 入栈：向栈里面添加元素
	 * 
	 * @param name
	 *            元素
	 */
	public void push(String name) {
		if (isFullStack()) {
			return;
		}
		nameArray[++top] = name;
	}

	/**
	 * 出栈：栈顶减1，元素出栈
	 * 
	 * @return
	 */
	public String outStack() {
		return nameArray[top--];
	}

	/**
	 * 查看栈里元素个数
	 * 
	 * @return
	 */
	public int stackTotal() {
		return top + 1;
	}

	/**
	 * 判断栈满
	 * 
	 * @return
	 */
	public boolean isFullStack() {
		return top == (length - 1);
	}

	/**
	 * 判断栈是否为空 如果栈顶等于-1，证明是空栈，返回true 如果栈顶不等于-1，证明不是空栈，返回false
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
		Stack2 stack = new Stack2();
		stack.nameArrayLength(4);
		stack.push("赵");
		stack.push("钱");
		stack.push("孙");
		stack.push("李");
		stack.push("周");
		System.out.println("查看栈里元素的个数：" + stack.stackTotal());
		// 出栈
		// 返回来的是false，证明不是空栈，
		while (!stack.isEmpty()) {
			System.out.println("出栈:" + stack.outStack());
		}
	}
}
