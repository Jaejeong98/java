package ����;

import java.util.*;

public class n_2443 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=0; i<num; i++) {
			for(int j=0; j<i; j++)
				System.out.print(" ");
			for(int j=(num-i)*2-1; j>0; j--)
				System.out.print("*");
			System.out.println("");
		}
	}
}
