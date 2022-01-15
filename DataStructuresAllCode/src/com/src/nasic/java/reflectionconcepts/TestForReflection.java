package com.src.nasic.java.reflectionconcepts;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import com.src.basic.datastructures.list.LinkedList;

public class TestForReflection {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		List ls=new ArrayList();
		
		Class cls= ls.getClass();
		
		System.out.println("Name of teh clas is "+cls.descriptorString());
		
		//Constructor cons=cls.getConstructor(ArrayList.class);
		Method[] method = cls.getDeclaredMethods();
		for(Method metho:method) {
			System.out.println(metho.getName());
			Method methodcall1 = cls.getDeclaredMethod("isEmpty");

			System.out.println("Invoking.."+methodcall1.invoke(ls, 19));
		}
		

	}

}
