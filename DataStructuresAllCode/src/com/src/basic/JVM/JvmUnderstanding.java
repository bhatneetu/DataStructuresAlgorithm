package com.src.basic.JVM;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class JvmUnderstanding {

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		Student s1= new Student();
		Class c1= s1.getClass();
		System.out.println("Classs Name "+c1.getName());
		
		Method[] m= c1.getMethods();
		
		for (Method method : m) {
			System.out.println("Methiod name is.."+method.getName());
		}
		
		Field[] feilds= c1.getDeclaredFields();
		for (Field feild : feilds) {
			System.out.println("Feild name is.."+feild.getName());
		}
		m[0].invoke(m[0], 0);
	}

}
class Student{
	private String name;
    private int roll_No;
  
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getRoll_no() { return roll_No; }
    public void setRoll_no(int roll_no)
    {
        this.roll_No = roll_no;
    }
}