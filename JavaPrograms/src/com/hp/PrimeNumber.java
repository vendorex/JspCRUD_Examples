package com.hp;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int num, i, count=0;
		Scanner sc;
		
		sc = new Scanner(System.in);
		System.out.println("Enter number...");
		num = sc.nextInt();
		
		
		for(i=2; i<num; i++){
             
			 if(num%i==0){
            	 count++;
            	 break;
             }
		}
		
		if(count==0){
			System.out.println("prime");
		}
		else{
			System.out.println("not a prime");
		}
		
		sc.close();
	}
}
