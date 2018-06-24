package Chapter6;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MaxHeapify {
	/*Max-Heapify(A,i)
	 * l = left(i)
	 * r = right(i)
	 * if l <= A.heapsize and A[l] > A[i]
	 * largest = l
	 * else
	 * largest = i
	 * if r<= A.heapsize and A[r] > A[largest]
	 * largest = r
	 * if largest does not equal i
	 * exchange A[i] with A[largest]
	 * Max-Heapify(A,largest)
	 */
	
	static int size;

	public static void main(String[] args) {
		//create heap sort
		Integer[] heap = {80,24,54,67,87,12,3,4,45};
		//call method
		
		
	
		heapSortBuildMaxHeap(heap);
		
		for(int i = 0; i < heap.length; i++){
			System.out.print(heap[i] + " ");
		}
		
		
		

	}
	
	public static void BuildMaxHeap(Integer[] A){

			size = A.length;
			
		for(int i = (int) Math.floor(size/2); i>= 0; i--){
			
			maxHeapify(A, i);
		}
		
	}
	
	public static Integer Parent(Integer i){
		return (int) Math.floor(1/2);
	}
	
	public static Integer Left(Integer i){
		return 2*i;
	}
	public static Integer Right(Integer i){
		return 2*i +1;
	}
	
	public static void maxHeapify(Integer[] A,Integer i){
		
		int left = Left(i);
		int right = Right(i);
		int largest = -1;
		size = A.length;
		
		
		
		if(left < size && A[left] > A[i]){
			largest = left;
	
		}
		else{
			
			largest = i;
		
		}
		if(right < size && A[right] > A[largest]){
			largest = right;
					
		}
		if(largest != i){
			
			//exchange A[i] with A[largest]
			int temp = A[i];
			A[i] = A[largest];
			A[largest] = temp;
			maxHeapify(A, largest);
		}
		


	}
	
	public static void heapSortBuildMaxHeap(Integer[] A){
		for(int i = A.length; i < A.length; i-=2){
			int temp = A[1];
			A[1] = A[i];
			A[i] = temp;
			size = A.length - 1;
			maxHeapify(A, 1);
		}
		
	}

}


