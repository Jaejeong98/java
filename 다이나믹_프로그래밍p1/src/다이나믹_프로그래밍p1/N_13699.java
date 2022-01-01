package 다이나믹_프로그래밍p1;

import java.util.*;

public class N_13699 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		long arr[]=new long[num+1];
		arr[0]=1;
		for(int i=1; i<=num; i++) {
			for(int j=0; j<i; j++) 
				arr[i]+=arr[j]*arr[i-j-1];
		}
		System.out.println(arr[num]);
	}
}
