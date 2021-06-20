package ±¸Çö2;

import java.util.*;

public class n_16199 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[6];
		for(int i=0; i<6; i++)
			arr[i]=sc.nextInt();
		int y=arr[3]-arr[0], m=arr[4]-arr[1],d=arr[5]-arr[2];
		if(m>0)System.out.println(y);
		else if(m<0)System.out.println(y-1);
		else {
			if(d>=0)System.out.println(y);
			else System.out.println(y-1);
		}
		System.out.println(y+1);
		System.out.println(y);
	}
}