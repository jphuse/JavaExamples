package me.Jackson.JavaExamples;
//demonstrate an inner class
public class Outer {
	int outer_x = 100;
	
	void test() {
		Inner inner = new Inner();
		inner.display();
	}
	
	//this is an inner class
	class Inner {
		void display() {
			System.out.println("Display: outer_x = " + outer_x);
		}
	}
}
