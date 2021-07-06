package 다이나믹_프로그래밍p1;

import java.util.*;

public class n_11057 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt(), dp[][]=new int[num+1][10];
		for(int i=0; i<10; i++)
			dp[0][i]=1;
		for(int i=1; i<num+1; i++) {
			for(int j=0; j<10; j++) {
				for(int k=j; k<10; k++) {
					dp[i][j] += dp[i-1][k];
					dp[i][j] %= 10007;
				}
			}
		}
		System.out.println(dp[num][0] % 10007); 
	}
}
