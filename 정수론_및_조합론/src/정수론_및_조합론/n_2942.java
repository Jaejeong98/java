package 정수론_및_조합론;

import java.util.*;

public class n_2942 {
	public static int gcd(int n1, int n2) {
		if(n2==0) return n1;
		else return gcd(n2,n1%n2);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt(), n2=sc.nextInt();
		int gcd=gcd(n1,n2);
		for(int i=1; i<=gcd; i++) {
			if(gcd%i==0)
				System.out.println(i+" "+n1/i+" "+n2/i);
		}
	}
}
