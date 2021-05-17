package ±¸Çö;

import java.util.*;

public class n_2445 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=0; i<num; i++) {
			for(int j=0; j<=i; j++)
				System.out.print("*");
			for(int j=(num-i-1)*2; j>0; j--)
				System.out.print(" ");
			for(int j=0; j<=i; j++)
				System.out.print("*");
			System.out.println("");
		}
		for(int i=0; i<num; i++) {
			for(int j=num-i-1; j>0; j--)
				System.out.print("*");
			for(int j=(i+1)*2; j>0; j--)
				System.out.print(" ");
			for(int j=num-i-1; j>0; j--)
				System.out.print("*");
			System.out.println("");
		}
	}
}
