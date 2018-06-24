package Lab5;

public class HireAssistant {
	/* best =0 //candidate 0 is a least- qualified dummy candidate
	 * for i = 1 to n
	 * interview candidate i
	 * if candidate i is better than candidate best
	 * best = i
	 * hire candidate i
	 * */
	public static void main(String[] args) {
		int[] Candidates = {5,2,7,4,2,9,2,6};
		System.out.println(hireAssistant(Candidates));
		
	}
	public static int hireAssistant(int[] c){
		int best = 0;//candidate 0 is a least- qualified dummy candidate
		
		
		for(int i = 1; i < c.length; i++){
			if(c[i] > c[best]){
				best = i;
			}
			
		}
		return best + 1;
		
		
	}

}
