package ±¸Çö2;

import java.util.*;

public class n_21591 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[4];
		for(int i=0; i<4; i++)
			arr[i]=sc.nextInt();
		boolean b=(arr[0]-arr[2])>=2&&(arr[1]-arr[3]) >= 2;
		System.out.println(b==true?1:0);
	}
}
