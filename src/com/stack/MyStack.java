package com.stack;

import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
    	
		/* UC1: Ability to create a Stack of 56->30->70 */
		Stack<Integer> stack = new Stack<>();
		
		/* UC:1
		 * 70 will be added first then 30 and then 56 to make 56 on top of the Stack
		 */
		stack.push(70);
		stack.push(30);
		stack.push(56);
		
		/* UC:2
		 * Ability to peak and pop from the Stack till it is empty
		 */
		System.out.println(stack.peek());//56
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());// 56 30 70
		}
		System.out.println(stack);//[]
		
	}
}
