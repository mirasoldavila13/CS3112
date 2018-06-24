package lab3;

public class bruteForce {
	/* lab 3 hint:
	maximum-subarray problem
	how can we return 2 values
	since we know each 3 values integers, you can use arrays, integers, 
	we can assume that they are one data type
	or you can create an object and return the value
	
	due 2/13/17 @ 6:00pm
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {13, -3, -25, 20, -3, -16, -23, 18, 20, -7, 12, -5, -22, 15, -4, 7};//remember in real life it doesn't start at "0"
		bruteForce(array); 

	}
	//1) (5 pts) Implement the maximum-subarray problem using brute-force approach taking Θ(n2)
	public static void bruteForce(int[] array){
		int buyingDay = 0, sellingDay = 0, maxNum = -100000;
		//if we want the time complexity to be 0(n^2) we must have two for loops
		for(int i = 0; i < array.length; i++){
			int sum = 0;//adding stocks
			for(int j = i; j < array.length; j++){
				sum+= array[j]; 
				
				if(sum > maxNum){
					buyingDay = i + 1;
					sellingDay = j + 1;
					maxNum = sum;
				}
			}
		}
		System.out.println("The Buying Day is: " + buyingDay + ", The Selling Day is: " + sellingDay + ", The Maximum amount is: " + maxNum);
	}
}
