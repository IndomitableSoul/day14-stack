package com.stack;

import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
    	
		/* UC1: Ability to create a Stack of 56->30->70 */
		Stack<Integer> stack = new Stack<>();
		
		/*
		 * 70 will be added first then 30 and then 56 to make 56 on top of the Stack
		 */
		stack.push(70);
		stack.push(30);
		stack.push(56);
		
	}
}
