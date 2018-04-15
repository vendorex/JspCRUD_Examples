package com.hp;

public class LinearSearch {

	public static void main(String[] args) {
		
		int num = 19;
		int[] arr = new int[5];
		arr[0] = 5;
		arr[1] = 2;
		arr[2] = 1;
		arr[3] = 19;
		arr[4] = 7;
		
		for(int i=0; i<arr.length; i++){
			if(arr[i] == num){
				System.out.println(num+" Found at index : "+i);
			}
		}
	}
}
