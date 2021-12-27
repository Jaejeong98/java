package 다이나믹_프로그래밍p1;

import java.util.*;

public class n_13301 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long arr[]=new long[n+2];
		arr[0]=0; arr[1]=1;
		for(int i=2; i<=n+1; i++)
			arr[i]=arr[i-1]+arr[i-2];
		System.out.print(2*(arr[n+1]+arr[n]));
	}
}
