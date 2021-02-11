package 기본수학1;

import java.util.*;

public class n_2292 {
	public static int count=0;
	public static void bee(int N) {
		N-=6*count;
		count++;
		if(N<=0) 
			return;
		else {
			bee(N);
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		bee(N-1);
		System.out.println(count);
	}
}