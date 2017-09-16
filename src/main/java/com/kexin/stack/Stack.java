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
		// 为成员变量赋值
		this.stackLength = max;
		// 数组的容量
		numberArray = new int[max];
	}

	/**
	 * 入栈：向栈中添加元素
	 * 
	 * @param number
	 */
	public int push(int number) {
		// 如果数组满了，则不入栈，直接返回
		if (isFullStack()) {
			return top + 1;
		}
		// 栈顶加1，把元素入栈
		numberArray[++top] = number;
		return top;
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
		// //如果栈顶等于数组最大容量，则返回true
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
		int numberLength = 3;
		stack.numberArrayLength(numberLength);
		// 入栈
		for (int i = 1; i < 5; i++) {
			int returnTab = stack.push(i);
			// 如果返回数组下标的值等于数组最大长度，则为满栈。
			if (returnTab < numberLength) {
				System.out.println(i + ":入栈了");
			} else {
				System.out.println(i + ":出栈了，栈满了");
			}
		}
		// 查看栈
		System.out.println("查看栈：" + stack.peek());
		// 出栈
		// !比较的结果是一个布尔值（ true 或 false ）,取反
		while (!stack.isEmpty()) {
			System.out.println("出栈:" + stack.pop());
		}
	}
}
