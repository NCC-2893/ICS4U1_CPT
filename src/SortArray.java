/**
 * Marcus Moreira
 * 11/10/2021
 * SortArray.java
 */

public class SortArray {
    // Sort the array using Bubble Sort based on the constant speed 

    public void bubbleSort(Velocity[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-1; j++ ) {
				if (arr[j].getConstantSpeed() > arr[j+1].getConstantSpeed()) {
					// Swap the elements
					Velocity temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp; 
				}
			}
		}
	}
}
