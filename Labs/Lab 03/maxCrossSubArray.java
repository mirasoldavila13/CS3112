package lab3;

public class maxCrossSubArray {
	public static void main(String[] args){
		int[] array = {13, -3, -25, 20, -3, -16, -23, 18, 20, -7, 12, -5, -22, 15, -4, 7};
		
		maxSubArray1 mSub =  maxSubarray(array, 0, array.length - 1);
		System.out.println("Maximum left-side SubArray: " + mSub.maxLeft);
		System.out.println("Maximum right-side SubArray: " + mSub.maxRight);
		System.out.println("Maximum sum SubArray: " + mSub.maxSum);
		
	}

	public static maxSubArray1 maxCrossingSubArray(int[] array, int low, int mid, int high){
		int leftSum = -100000, sum = 0, rightSum = -100000,  maxSum = 0, maxLeft = 0, maxRight = 0;
		
		maxSubArray1 maxObj = new maxSubArray1(0,0,0);
		//for i = mid down to low
		for(int i = mid; i >= low; i--){
			sum+= array[i]; //sum+= array[i]
			if(sum > leftSum){//sum > leftsum - sum
				leftSum = sum;
				maxObj.maxLeft = i;	// max - leftsum = i
				
			}
		}
		
		sum = 0;
				
		for(int j = mid + 1; j < high; j++){ //for j = mid + 1 to high
			sum += array[j]; //sum += array[j]
		if(sum > rightSum){ //sum > right - sum
			rightSum = sum;// right - sum = sum
			maxObj.maxRight = j;//	array[j] = (max - right); 
		}
	}
		maxObj.maxSum = (maxObj.maxLeft + maxObj.maxRight);
		return maxObj;
}
	//return( (max - leftSum), (max - right), (leftSum - sum + right - sum));

	public static maxSubArray1 maxSubarray(int[] A, int low, int high){
		
		maxSubArray1 Conquer = new maxSubArray1(low, high, A[low]);
		
		if(high == low){//if high == low
			return Conquer;//base case: only one element
		}
		
		else{
			int mid = (int) Math.floor((low + high) / 2); 
			
			maxSubArray1 leftSide = maxSubarray(A, low, mid);
			maxSubArray1 rightSide = maxSubarray(A, mid + 1, high);
			maxSubArray1 crossLR = maxCrossingSubArray(A, low, mid, high);
			
			if(( leftSide.maxSum >= rightSide.maxSum) && (leftSide.maxSum >= crossLR.maxSum) ){
				return leftSide;
			}
			else if ( (rightSide.maxSum >= leftSide.maxSum) && (rightSide.maxSum >= crossLR.maxSum) ){
				return rightSide;
			}
			else{
				return crossLR;
			}
		}
		
	}


}
