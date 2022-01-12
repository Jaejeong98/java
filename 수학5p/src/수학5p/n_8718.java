package ¼öÇÐ5p;

import java.util.*;

public class n_8718 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt(), n2=sc.nextInt();
		if(n2*7<=n1) System.out.print(n2*7000);
		else if(n2*3.5<=n1) System.out.print(n2*3500);
		else if(n2*1.75<=n1) System.out.print(n2*1750);
		else System.out.print(0);
	}
}
