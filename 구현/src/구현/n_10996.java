package ±¸Çö;

import java.util.*;

public class n_10996 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=1; i<2*num+1; i++) {
			for(int j=i; j<i+num; j++) {
				if(j%2==0)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println("");
		}
	}
}
