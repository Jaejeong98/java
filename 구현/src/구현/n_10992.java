package ±¸Çö;

import java.util.*;

public class n_10992 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=1; i<=num; i++) {
			if(i==num) {
				for(int j=0; j<i*2-1; j++)
					System.out.print("*");
			}else {
				for(int j=1; j<=num-i; j++)
					System.out.print(" ");
				for(int j=1; j<=2*i-1; j++) {
					if(j==1||j==2*i-1)
						System.out.print("*");
					else
						System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
}
