package ±¸Çö2;

import java.util.*;

public class n_16017 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[4];
		for(int i=0; i<4; i++)
			arr[i]=sc.nextInt();
		boolean b=false;
		if(arr[0]==8||arr[0]==9) {
			if(arr[3]==8||arr[3]==9) {
				if(arr[1]==arr[2]) b=true;
			}
		}
		System.out.println(b?"ignore":"answer");
	}
}