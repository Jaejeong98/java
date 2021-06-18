package ±¸Çö;

import java.util.*;

public class n_13118 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[7];
		for(int i=0; i<7; i++)
			arr[i]=sc.nextInt();
		boolean b=false;
		for(int i=0; i<4; i++) {
			if(arr[i]==arr[4]) {
				b=true;
				System.out.println((i+1));
			}
		}
		if(b==false)
			System.out.println(0);
	}
}
