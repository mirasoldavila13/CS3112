package lab3;

public class maxSubArray1 {
	int maxLeft, maxRight, maxSum;
	
	public maxSubArray1(int maxLeft, int maxRight, int maxSum) {
		this.maxLeft = maxLeft;
		this.maxRight = maxRight;
		this.maxSum = maxSum;
	}

	public int getMaxLeft() {
		return maxLeft;
	}

	public void setMaxLeft(int maxLeft) {
		this.maxLeft = maxLeft;
	}

	public int getMaxRight() {
		return maxRight;
	}

	public void setMaxRight(int maxRight) {
		this.maxRight = maxRight;
	}

	public int getMaxSum() {
		return maxSum;
	}

	public void setMaxSum(int maxSum) {
		this.maxSum = maxSum;
	}

}