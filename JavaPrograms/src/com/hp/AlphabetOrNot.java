package com.hp;

import java.util.Scanner;

public class AlphabetOrNot {

	public static void main(String[] args) {
		
		char ch; 
		Scanner sc = null;
		
		sc = new Scanner(System.in);
		System.out.println("Enter alphabet");
		ch = sc.next().charAt(0);
		
		if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
			System.out.println(ch+" It is alphabet");
		}
		else{
		  System.out.println(ch+" Not aphabet");
		}
		
		sc.close();
	}
}
