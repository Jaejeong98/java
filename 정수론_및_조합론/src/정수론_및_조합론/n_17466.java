package ������_��_���շ�;

import java.util.*;

public class n_17466 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long n1=sc.nextLong(),n2=sc.nextLong(), re=1;
		for(long i=1; i<=n1; i++) {
			re*=i;
			re%=n2;
		}
		System.out.println(re);
	}
}
