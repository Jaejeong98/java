package 다이나믹_프로그래밍p1;

import java.util.*;

public class n_11727 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(), arr[]=new int[1001];
		arr[0]=arr[1]=1;
		for(int i=2; i<=n; i++)
			arr[i]=(arr[i-1]+arr[i-2]*2)%10007;
		System.out.println(arr[n]);
	}
}