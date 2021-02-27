package ¼öÇĞp2;

import java.util.*;

public class n_1735 {
	public static int gcd(int n1, int n2) {
		if(n2==0)
			return n1;
		else
			return gcd(n2, n1%n2);
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[4];
		for(int i=0; i<4; i++)
			arr[i]=sc.nextInt();
		int T=arr[0]*arr[3]+arr[1]*arr[2];
		int B=arr[1]*arr[3];
		System.out.println(T/gcd(T,B)+" "+B/gcd(T,B));
	}
}
