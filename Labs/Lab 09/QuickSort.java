package Chapter7;

import java.util.Random;
import java.util.RandomAccess;

public class QuickSort {
	/*
	 * QuickSort(A,p,r)
	if p < r
	q = Partition(A,p,r)
	QuickSort(A,p,q-1)
	QuickSort(A, q+1,r)

	 */
	/*
	 * Partition(A,p,r)
	x = A[r]//pivot
	i = p-1
	for j = p to r-1
		i = i + 1
		exchange A[i] with A[j]
		exchange A[i + 1] with A[r]
		return i+1

	 */

	public static void main(String[] args) {
	//create quicksort integer
	Integer[] list = {6, 8, 20, 45, 3, 24, 17, 13, 2};
	System.out.println("Original list: ");
	
	for(int i = 0; i < list.length; i++){
		System.out.print(list[i] + " ");
	}
	
	System.out.println();
	System.out.println();
	
	quickSort(list);
	
	System.out.println("QuickSort list: ");
	for(int i = 0; i < list.length; i++){
		System.out.print(list[i] + " ");
	}
	
	System.out.println();
	System.out.println();
	
	quickSortRan(list);
	System.out.println("Random QuickSort list: ");
	for(int i = 0; i < list.length; i++){
		System.out.print(list[i] + " ");
	}

	}
	
	public static void quickSort(Integer[] list){
		quickSort(list, 0, list.length - 1);
		
	}
	public static void quickSort(Integer[] list, int p, int r){
		if(p < r){
			int q = partition(list, p , r);
			//recursive call
			quickSort(list, p, q - 1);
			quickSort(list, q + 1, r);
		}
	}
	
	public static int partition(Integer[] list, int p, int r){
		int pivot =  list[r];
		int i = p -1;
		for(int j = p; j <= r- 1; j++){
			if(list[j] <= pivot){
				i += 1;
				//exchange A[i] with A[j]
				Integer temp = list[i];
				list[i] = list[j];
				list[j] = temp;
			}
			
		}
		//exchange A[i + 1] with A[r]
		Integer temp2 = list[i + 1];
		list[i + 1] = list[r];
		list[r] = temp2;
		return i + 1;
	}
	
	public static void quickSortRan(Integer[] list){
		randomizeQuicksort(list, 0, list.length - 1);
		
	} static void randomizeQuicksort(Integer[] list, int p, int r){
		if(p < r){
			int q = randomizePartition(list, p , r);
			//recursive call
			randomizeQuicksort(list, p, q - 1);
			randomizeQuicksort(list, q + 1, r);
		}
	}
	
	public static int randomizePartition(Integer[] list, int p, int r){
		int i = random(p,r);
		//exchange A[r] with A[i]
		Integer temp = list[r];
		list[r] = list[i];
		list[i] = temp;
		return partition(list, p, r);
		
	}
	

	public static int random(int p, int r) {
		int ran = (p + (int) (Math.random() * (r - p + 1)));
		 return ran;
		
		
	}
	

}
