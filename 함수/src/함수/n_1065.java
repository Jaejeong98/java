package ÇÔ¼ö;

import java.util.*;

public class n_1065 {
	public static int han(int n) {
		int count=0, n1,n2,n3;
		for(int i=100; i<=n; i++) {
			n1=i/100;
			n2=(i%100)/10;
			n3=i%10;
			if((n1-n2)==(n2-n3))
				count++;
		}
		return count+99;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		if(N<100)
			System.out.println(N);
		else if(N<=1000)
			System.out.println(han(N));
	}
}
