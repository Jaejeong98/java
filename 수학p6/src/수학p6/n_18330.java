package ¼öÇÐp6;

import java.util.*;

public class n_18330 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt(), n2=sc.nextInt()+60;
		System.out.print(n1<=n2?n1*1500:n2*1500+(n1-n2)*3000);
	}
}
