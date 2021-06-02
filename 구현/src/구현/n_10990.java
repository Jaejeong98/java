package ±¸Çö;

import java.util.*;

public class n_10990 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=0; i<num; i++) {
			for(int j=0; j<num-1-i; j++)
				System.out.print(" ");
			System.out.print("*");
			for(int j=0; j<i*2-1;j++)
				System.out.print(" ");
			if(i>0)
				System.out.print("*");
			System.out.println("");
		}
	}
}
