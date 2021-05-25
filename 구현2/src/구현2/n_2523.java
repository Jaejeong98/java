package ±¸Çö2;

import java.util.*;

public class n_2523 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int i=0; i<T; i++) {
			for(int j=0; j<i+1; j++)
				System.out.print("*");
			System.out.println("");
		}
		for(int i=0; i<T-1; i++) {
			for(int j=0; j<T-1-i; j++)
				System.out.print("*");
			System.out.println("");
		}
	}
}
