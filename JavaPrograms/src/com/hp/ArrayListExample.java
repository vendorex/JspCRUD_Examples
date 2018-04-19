package com.hp;

import java.util.ArrayList;
import java.util.Collections;


public class ArrayListExample {

	public static void main(String[] args) {

	ArrayList<Integer> al = new ArrayList<Integer>();
    al.add(1); al.add(8); al.add(4); al.add(99);
    
    Collections.sort(al, Collections.reverseOrder());
    System.out.println(al);
    
    
	}
}
