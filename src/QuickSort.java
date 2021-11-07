/**
 * Marcus Moreira
 * 11/07/2021
 * QuickSort.java
 */

    public static void quickSortGrade(Student[] students) {
        quickSortGrade(students, 0, students.length -1);
    }
    
    private static void quickSortGrade(Student[] students, int left, int right) {
        // Base Case
		if (left >= right) {
            return;
		}
		
		int pivot = partitionGrade(students, left, right);
		quickSortGrade(students, left, pivot-1);
		quickSortGrade(students, pivot+1, right);
	}

    private static int partitionGrade(Student[] students, int left, int right) {
		double pivot = students[right].getCurrentGrade();
		int pivotIndex = right;
		while (left <= right) {
			// Move the left pointer UNTIL we find a number < the pivot
			// until (strings[left] > pivot OR left == right)
			// DML not (A or B) => not A and not B
			while (students[left].getCurrentGrade() >= pivot && left != right) {
				left++;
			}
			
			while (students[right].getCurrentGrade() <= pivot && left != right) {
				right --;
			}
			
			if (left < right ) {
				swap(students, left, right);
			}
			
			if (left == right) {
				swap(students, left, pivotIndex);
				right--;
			}
		}
		
		return left;
	}

    private static void swap(Student[] students, int left, int right) {
		Student temp = students[left];
		students[left] = students[right];
		students[right] = temp;
	}
}
