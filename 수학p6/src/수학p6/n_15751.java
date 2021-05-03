package ¼öÇĞp6;

import java.util.Scanner;

public class n_15751 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[4];
		for(int i=0; i<4; i++)
			arr[i]=sc.nextInt();
		int num1=Math.abs(arr[0]-arr[1]);
		int num2=Math.abs(arr[0]-arr[2])+Math.abs(arr[3]-arr[1]);
		int num3=Math.abs(arr[0]-arr[3])+Math.abs(arr[1]-arr[2]);
		System.out.println(Math.min(Math.min(num1, num2), num3));
	}
}
