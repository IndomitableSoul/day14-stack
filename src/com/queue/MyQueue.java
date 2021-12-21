package com.queue;

import java.util.LinkedList;
import java.util.Queue;

public class MyQueue{
	/*UC-3
	 * Ability to create a Queue of 56->30->70
	 * Use LinkedList to do the Queue Operations
	 */
	LinkedList<Integer> list = new LinkedList<>();
	 
	public void enqueue(Integer a) {
		list.add(a);
	}

	/*UC-4
	 * Ability to dequeue from the beginning
	 */
	public void dequeue() {
		list.remove();
	}
	public static void main(String[] args) {
		MyQueue queue =  new MyQueue();
		queue.list.add(30);
		queue.list.add(70);
		queue.list.add(56);
		System.out.println(queue.list);
		queue.dequeue();
		System.out.println(queue.list);
	}
}
