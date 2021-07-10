package 다이나믹_프로그래밍p1;

import java.util.*;

public class n_17626 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt(), dp[]=new int[num+1], ans=0;
		dp[0]=0; dp[1]=1;
		for(int i=2; i<=num; i++) {
			ans=Integer.MAX_VALUE;
			for(int j=1; j*j<=i; j++)
				ans=Math.min(ans, dp[i-j*j]);
			dp[i]=ans+1;
		}
		System.out.println(dp[num]);
	}
}
