package ¼öÇÐ;

import java.util.*;

public class n_2558 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt(), B=sc.nextInt();
		int C=B%10, D=(B%100)/10, E=B/100;
		System.out.println(A*C+"\n"+A*D+"\n"+A*E+"\n"+A*B);
	}
}
