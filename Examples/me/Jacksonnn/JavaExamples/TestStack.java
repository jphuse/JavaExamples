package me.Jackson.JavaExamples;

class Stack {
	int stck[] = new int[10];
	int tos;
	
	Stack() {
		tos= -1;
	}
	
	void push(int item) {
		if(tos == 9)
			System.out.println("Stack is full.");
		else
			stck[++tos] = item;
	}
	
	int pop() {
		if(tos < 0) {
			System.out.println("Stack underflow.");
			return 0;
		}
		else
			return stck[tos--];
	}
}

public class TestStack {
	Stack mystack1 = new Stack();
	Stack mystack2 = new Stack();
	
	//push some numbers onto the stack
	for(int i=0; i < 10; i++) mystack1.push(i);
	for(int i=10; i < 20; i++) mystack2.push(i);
}
