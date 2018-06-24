
public class Lab02 {



	public static void main(String[] args) {
		//create an array
		Integer[] array = {3,41,52,26,38,57,9,49};
		int[] arr = {3,41,52,26,38,57,9,49};

		//call the method
		System.out.println("Binary Search: ");
		
		System.out.println(binarySearch(arr,2));


		System.out.println();
		System.out.println("Merge Sort: ");
		merge(array);
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + " ");
		}
	}

	//1) (5 pts) Implement binary-search.

	public static int binarySearch(int[] arr, int key){
		int high = arr.length - 1;
		int low = 0;

		while(high >= low){
			int mid = (low + high) / 2;
			if(key < arr[mid]){
				high = mid - 1;
			}
			else if(key == arr[mid]){
				return mid;
			}
			else{
				low = mid + 1;
			}
		}
		return -low - 1;
	}



	//2) (5 pts) Implement Merge-sort algorithm in Chapter 2
	public static <E extends Comparable<E>> void merge(E[] array){

		if(array.length > 1){

			int mid = array.length / 2;
			E[] firstHalf = (E[]) new Comparable[mid];
			System.arraycopy(array, 0, firstHalf, 0, mid);
			merge(firstHalf);

			//second half
			E[] secondHalf = (E[]) new Comparable[array.length - mid];
			System.arraycopy(array, mid, secondHalf,0, array.length - mid);
			merge(secondHalf);

			//merge both of then
			E[] temp = merge(firstHalf, secondHalf);

			System.arraycopy(temp, 0, array, 0, temp.length);
		}

	}
	public static<E extends Comparable<E>> E[] merge(E[] firstHalf, E[] secondHalf){
		E[] temp = (E[]) new Comparable[firstHalf.length + secondHalf.length];

		//list1 current index
		int current1 = 0;
		//list2 current index
		int current2 = 0;
		//temp current index
		int current3 = 0;

		while(current1 < firstHalf.length && current2 < secondHalf.length){
			if(firstHalf[current1].compareTo(secondHalf[current2]) < 0){
				temp[current3++] = firstHalf[current1++];
			}
			else{
				temp[current3++] = secondHalf[current2++];
			}
		}
		while(current1 < firstHalf.length){
			temp[current3++] = firstHalf[current1++];
		}
		while(current2 < secondHalf.length){
			temp[current3++] = secondHalf[current2++];
		}
		return temp;
	}

}
