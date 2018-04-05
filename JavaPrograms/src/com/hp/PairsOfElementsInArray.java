package com.hp;

public class PairsOfElementsInArray {

	public static void findThePairs(int[] inputArray, int number){
		System.out.println("Pairs of elements whose sum is "+number+" are... ");
		
		for(int i=0; i<inputArray.length; i++){
			for(int j=i+1; j<inputArray.length; j++){
				if((inputArray[i]+inputArray[j])==number){
					System.out.println(inputArray[i]+" + "+inputArray[j]+" = "+number);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		findThePairs(new int[]{6,4,9,2,1,7,5,3,10}, 10);
	}
}
