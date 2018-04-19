package com.hp;



class A{

  private void m1(){
	  System.out.println("super class");
  }
	
}

public class ExampleDemo extends A{

	private void m1(){
		  System.out.println("super class");
	  }
		
	public static void main(String[] args) {
	
	ExampleDemo obj = new ExampleDemo();
	obj.m1();
	
	
  }
}
