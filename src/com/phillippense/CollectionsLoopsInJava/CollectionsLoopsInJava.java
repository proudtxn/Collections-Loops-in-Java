package com.phillippense.CollectionsLoopsInJava;

import java.util.Scanner;

public class CollectionsLoopsInJava {
	
	public static int[] getArray() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 5 numbers with spaces in between each: ");
		String input = scan.nextLine();
		String[] stringArr = input.split(" ");
		int[] intArr = new int[5];
		
		for (int i = 0; i < 5; i++) {
			intArr[i] = Integer.parseInt(stringArr[i]);
		}
		
		scan.close();
		return intArr;
	}
	
	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("Element #" + i + ": " + array[i]);
		}
	}
	
	public static void printArrayInReverse(int[] arrayInReverseOrder) {
		for (int i = 0; i < arrayInReverseOrder.length; i++) {
			System.out.println("Element #" + i + ": " + arrayInReverseOrder[arrayInReverseOrder.length-1-i]);
		}
	}
	
	public static void printArrayOdd(int[] arrayOdd) {
		for (int i = 1; i < arrayOdd.length; i=i+2) {
			System.out.println("Element #" + i + ": " + arrayOdd[i]);
		}
	}

	public static void main(String[] args) {
	
		int[] myArr = getArray();
		printArray(myArr);
		
		String reverse = "Printed In Revese Order";
		System.out.println(reverse);
		printArrayInReverse(myArr);
		
		String odd = "Print Only Odd Index";
		System.out.println(odd);
		printArrayOdd(myArr);
		
	
	}

}
