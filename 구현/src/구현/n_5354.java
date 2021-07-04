package ±¸Çö;

import java.util.*;

public class n_5354 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int i=0; i<T; i++) {
			int num=sc.nextInt();
			for(int j=0; j<num; j++) {
				for(int k=0; k<num; k++) {
					if(j==0||j==num-1||k==0||k==num-1)
						System.out.print("#");
					else System.out.print("J");
				}
				System.out.println("");
			}
			System.out.println("");
		}
	}
}
