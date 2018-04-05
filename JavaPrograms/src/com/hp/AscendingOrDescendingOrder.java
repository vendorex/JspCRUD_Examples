package com.hp;

public class AscendingOrDescendingOrder {

	public static void main(String[] args) {
		
		int[] arr = new int[]{5,9,1,0,3,8,4,2};
		int temp;
		
		for(int i=0; i<arr.length; i++){
			for(int j=i+1; j<arr.length; j++){
				
				if(arr[i] < arr[j]){
					
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
				
			}
		}
		
		System.out.println("Ascending order....");
		for(int k=0; k<arr.length; k++){
			System.out.print(arr[k]+" ");
		}
		
	}
}
