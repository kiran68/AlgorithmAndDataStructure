package com.bridgelabz.algorithmanddatastructure;

public class BubbleSort {
	public static void bubbleSort(int[] arrayInt) {

		int num = arrayInt.length;
		for (int i = 0; i < num - 1; i++) {
			for (int j = 0; j < num - i - 1; j++) {
				if (arrayInt[j] > arrayInt[j + 1]) {
					int temp = arrayInt[j];
					arrayInt[j] = arrayInt[j + 1];
					arrayInt[j + 1] = temp;
				}
			}
		}
	}

	public static void printArray(int[] arrayInt) {
		for (int i = 0; i < arrayInt.length; i++) {
			System.out.print(arrayInt[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arrayInt = { 9, 5, 7, 3, 6, 1, 8, 0, 4 };
		System.out.println("Before sorting:");
		printArray(arrayInt);
		bubbleSort(arrayInt);
		System.out.println("After sorting:");
		printArray(arrayInt);
	}

}
