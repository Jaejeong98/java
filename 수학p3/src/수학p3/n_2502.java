package ¼öÇÐp3;

import java.util.*;

public class n_2502 {
	public static int fibo(int n) {
		if(n==0||n==1)
			return 1;
		else
			return fibo(n-1)+fibo(n-2);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int D=sc.nextInt(), K=sc.nextInt(), A=1, B=1;
		int a=fibo(D-3), b=fibo(D-2);
		while(true) {
			if((K-a*A)%b==0) {
				B=(K-a*A)/b;
				break;
			}
			A++;
		}
		System.out.println(A+"\n"+B);
	}
}