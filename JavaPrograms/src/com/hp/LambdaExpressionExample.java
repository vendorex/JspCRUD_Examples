package com.hp;

@FunctionalInterface
interface Drawable{
     int add(int a, int b);
}


public class LambdaExpressionExample {

	public static void main(String[] args) {
		
		Drawable d = (a, b) -> (a+b);
		System.out.println(d.add(10, 10));
	}
}
