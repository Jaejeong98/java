package ±¸Çö3;

import java.util.*;

public class n_15025 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt(), n2=sc.nextInt();
		if(n1==0&&n2==0)
			System.out.print("Not a moose");
		else
			System.out.print(n1==n2?"Even "+(n1+n2):"Odd "+Math.max(n1, n2)*2);
	}
}
