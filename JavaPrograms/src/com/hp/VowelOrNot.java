package com.hp;

import java.util.Scanner;

public class VowelOrNot {

	
	
	public static void checkVowelOrNot(char ch){
		if(ch=='a' || ch=='e'|| ch=='i'|| ch=='o'|| ch=='u' || 
		   ch=='A' || ch=='E'|| ch=='I'|| ch=='O'|| ch=='U'	){
			System.out.println(ch+" is vowel");
		}
		else{
			System.out.println(ch+" Not vowel");
		}
	}

	public static void main(String[] args) {
		
		char ch; 
		Scanner sc = null;
		
		sc = new Scanner(System.in);
		System.out.println("Enter aphabet to check ");
		ch = sc.next().charAt(0);
		
		checkVowelOrNot(ch);
		
		sc.close();
		
	}
}
