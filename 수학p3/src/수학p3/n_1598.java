package ¼öÇÐp3;

import java.util.*;

public class n_1598 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt()-1, n2=sc.nextInt()-1;
		System.out.println(Math.abs(n1/4-n2/4)+Math.abs(n1%4-n2%4));
	}
}
