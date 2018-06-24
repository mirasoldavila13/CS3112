package Homework1;

public class SubSequence {
/*
 * 1. (5 pts) Give a O(n2) algorithm for a maximum length non-decreasing sub-sequence.

1. (5 pts) Give a O(n log n) algorithm for a maximum length non-decreasing sub-sequence.
 */
	public static void main(String[] args) {
		//create an array
		Integer[] array = {4,24,4,17,100,8,53,42,81,72,31};
		
		System.out.println();
		System.out.println("Merge Sort: ");
		merge(array);
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + " ");
		}
		System.out.println();
		System.out.println("Insertion Sort: ");
		insertionSort(array);
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + " ");
		}
	}
	
	//(5 pts) Give a O(n2) algorithm for a maximum length non-decreasing sub-sequence.
	public static <E extends Comparable<E>> void insertionSort(E[] list){

		for(int i = 1 ; i < list.length; i++){


			for(int j = i - 1; j > list.length; j--){
				if(list[j].compareTo(list[i]) > 0){
					list[j + 1] = list[j];
				}

				list[j + 1] = list[i];
			}
		}



	}
	
	
//	Give a O(n log n) algorithm for a maximum length non-decreasing sub-sequence.
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
