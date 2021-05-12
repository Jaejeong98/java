package ±¸Çö;

import java.util.*;

public class n_2440 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int j=0; j<num; j++) {
			for(int i=0; i<num-j; i++)
				System.out.print("*");
			System.out.println("");
		}
	}
}
