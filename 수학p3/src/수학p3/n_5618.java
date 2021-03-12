package ¼öÇÐp3;

import java.util.*;

public class n_5618 {
	public static int gcd(int n1, int n2) {
		if(n2==0)
			return n1;
		else
			return gcd(n2, n1%n2);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(), n1=sc.nextInt(), n2=sc.nextInt();
		if(n==2) {
			for(int i=1; i<=gcd(n1, n2); i++) {
				if(gcd(n1, n2)%i==0)
					System.out.println(i);
			}
		}else {
			int n3=sc.nextInt();
			for(int i=1; i<=gcd(gcd(n1, n2), n3); i++) {
				if(gcd(gcd(n1, n2), n3)%i==0)
					System.out.println(i);
			}
		}
	}
}
