package tut06;

public class Cal {
	
	public int sum(int[] scores) {
		int sum =0;
		for(int i=0; i<scores.length; i++) {
			sum+=scores[i];
		}
	return sum;
	}
	
	
	public double avg(int[]scores) {
		int sum=0;
		for(int i=0; i<scores.length;i++) {
			sum += scores[i];
		}
	
	return(double)sum/scores.length;
	}

}
