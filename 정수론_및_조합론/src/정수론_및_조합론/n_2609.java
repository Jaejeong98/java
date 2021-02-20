package 정수론_및_조합론;

import java.util.*;

public class n_2609 {
	public static int gcd(int num1, int num2) {
		if(num2==0)
			return num1;
		else
			return gcd(num2, num1%num2);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt(), n2=sc.nextInt();
		System.out.println(gcd(n1, n2)+"\n"+n1*(n2/gcd(n1,n2)));
	}
}
