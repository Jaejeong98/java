package ±¸Çö3;

import java.util.*;

public class n_23794 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=0; i<num+2; i++) {
			for(int j=0; j<num+2; j++) {
				if(i==0||i==num+1||j==0||j==num+1)
					System.out.print("@");
				else System.out.print(" ");
			}
			System.out.println();
		}
	}
}