package Homework2;

public class BinPacking {
	/*
  You are given a set of N numbers, and a bin capacity C. Your task is to assign each number to a bin so that
 the sum of the numbers in each bin is no greater than the bin capacity C, which is the same for all bins. 
 In an optimal solution for bin packing problem, the number of bins is minimized. For example, given the 
 set of 6 numbers {21, 28, 31, 32, 33, 49} and C = 100, an optimal solution to this problem is two bins as follows:
  49+28+21 = 98 and 33+32+31 = 96.

 Your task is to design an algorithm that you can find the optimal solution to the bin-packing problem.

 */

	public static void main(String[] args) {
		int[] num = {21, 28, 31, 32, 33, 49};
		int C = 100;//bin capacity c
		int n;
		
		
		
	}
	
	public int bin(int[] num, int n, int c){
		int numOfBin = 0;
		int remainingSpace[] = new int[n];
		for(int i = 0; i < n; i++){
			for(int j =0; j < numOfBin; j++){
				if(remainingSpace[j] >= num[i]){
					remainingSpace[j] += num[i];
					break;
				}
			}
			
		}
		return numOfBin;
	}

}
