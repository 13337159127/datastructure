package com.kexin.arraystack;

public class Stack3 {

	// 定义栈的长度
	private int numberLength;
	// 定义数组和栈的容量
	private int[] numberArray;
	// 定义栈顶，栈顶等于-1，为空栈
	public int top = -1;

	/**
	 * 定义数组的长度
	 * 
	 * @param max
	 */
	public void numberLengthArray(int max) {
		this.numberLength = max;
		numberArray = new int[max];
	}

	/**
	 * 入栈
	 * 
	 * @param number
	 */
	public int push(int number) {
		// 如果为满栈，直接返回
		if (isFullStack()) {
			return top + 1;
		}
		// 栈顶加1(从0开始) 元素入栈
		numberArray[++top] = number;
		// 返回数组下标
		return top;
	}

	/**
	 * 出栈
	 * 
	 * @return
	 */
	public int outStack() {
		// 栈顶减1，出栈
		return numberArray[top--];
	}

	/**
	 * 数组中元素的个数
	 * 
	 * @return
	 */
	public int stackTotal() {
		return top + 1;
	}

	/**
	 * 判断是否满栈
	 * 
	 * @return
	 */
	public boolean isFullStack() {
		// 栈顶等于数组的最大容量，为满栈，返回true
		return top == (numberLength - 1);
	}

	/**
	 * 判断是否为空栈
	 * 
	 * @return
	 */
	public boolean isEmpty() {
		// 如果栈顶不等于-1，就不是空栈
		return top == -1;
	}

	/**
	 * 调用方法，传参数
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Stack3 stack = new Stack3();
		int numberLength = 2;
		stack.numberLengthArray(numberLength);
		for (int i = 1; i < 4; i++) {
			int returnNumber = stack.push(i);
			// 如果返回入栈下标小于数组的最大容量，则入栈成功。
			// 如果大于数组最大容量，栈满了，入栈失败
			if (returnNumber < numberLength) {
				System.out.println(i + "：入栈成功");
			} else {
				System.out.println(i + "：入栈失败，栈满了");
			}
		}

		System.out.println("数组中元素的个数：" + stack.stackTotal());
		// 出栈
		while (!stack.isEmpty()) {
			System.out.println("出栈：" + stack.outStack());
		}
	}

}
