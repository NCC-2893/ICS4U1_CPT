/**
 * Marcus Moreira
 * 11/07/2021
 * BubbleSort.java
 */

class BubbleSort {
	// public static void main(String[] args) {
	// 	int[] myArray = {4, 1, 3, -9, 10, 8};
	// 	System.out.println(myArray);
	// 	bubbleSort(myArray);
		
	// 	for (int num: myArray) {
	// 		System.out.print(num+ " ");
	// 	}
		
	// }
	
	public static void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-1; j++ ) {
				if (arr[j] > arr[j+1]) {
					// Swap the elements
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp; 
				}
			}
		}
	}
}