package 다이나믹_프로그래밍p1;

import java.util.*;

public class n_2631 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt(), arr[]=new int[T],dp[] = new int[T];
		for(int i=0; i<T; i++) 
			arr[i]=sc.nextInt();
	    for(int i=0; i<T; i++) {
	    	dp[i] = 1;
	    	for(int j=0; j<i; j++) {
	    		if(arr[i] > arr[j] && dp[i]<=dp[j])
	    			dp[i] = dp[j]+1;
	        }
	   }
	   Arrays.sort(dp);
	   System.out.println(T-dp[T-1]);
	}
}
