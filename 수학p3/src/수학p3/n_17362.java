package ¼öÇÐp3;

import java.util.*;

public class n_17362 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		n%=8;
		if(n==0)
			n=2;
		else if(n>5)
			n=10-n;
		System.out.println(n);
	}
}
