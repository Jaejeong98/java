package 정수론_및_조합론;

import java.util.*;

public class n_2981 {
	public static int gcd(int num1, int num2) {
		if(num2==0)
			return num1;
		else
			return gcd(num2, num1%num2);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int M=sc.nextInt();
		int[] arr=new int[M];
		for(int i=0; i<M; i++)
			arr[i]=sc.nextInt();
		Arrays.sort(arr);
		int gcdn=arr[1]-arr[0];
		for(int i=2; i<M; i++)
			gcdn=gcd(gcdn, arr[i]-arr[i-1]);
		for(int i=2; i<=gcdn; i++) {
			if(gcdn%i==0)
				System.out.print(i+" ");
		}
	}
}