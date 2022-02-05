package com.src.basic.datastructures.amexCodility;

import com.src.basic.datastructures.amexCodility.Parent.InnerClass;

public class TestStaticAndBasicClassFunct {

	public static void main(String[] args) {
		Parent p= new Parent();
		InnerClass inner=p.new InnerClass();
		
	}

}
class Parent{
	int x=0;
	static {
		
		System.out.println("Inside Parent static class");
	}
	public Parent() {
		System.out.println("Inside Parent constructor...");
		this.x=10;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	class InnerClass{
		public InnerClass() {
			System.out.println("Inside Parent's Inner class constructor...");
		}
		static {
			System.out.println("Inside static method of inner class");
		}
	}
}
class Child extends Parent{
	static {
		System.out.println("Inside static of construtor");
	}
	public Child() {
		System.out.println("Inside Child Constructor");
	}
}