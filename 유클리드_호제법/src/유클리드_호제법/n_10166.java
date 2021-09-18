package 유클리드_호제법;

import java.util.*;

public class n_10166 {
	public static int gcd(int n1, int n2) {
		if(n2==0)
			return n1;
		else
			return gcd(n2, n1%n2);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt(), n2=sc.nextInt(), count=0;
		boolean b[][]=new boolean[2001][2001];
		for(int i=n1; i<=n2; i++) {
			for(int j=1; j<=i; j++) {
				int num=gcd(i,j);
				if(b[i/num][j/num])
					continue;
				else {
					count++;
					b[i/num][j/num]=true;
				}
			}
		}
		System.out.println(count);
	}
}