package ¼öÇĞ5p;

import java.util.*;

public class n_14173 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[8];
		for(int i=0; i<8; i++)
			arr[i]=sc.nextInt();
		int num1=Math.max(arr[2], arr[6])-Math.min(arr[0], arr[4]);
		int num2=Math.max(arr[3], arr[7])-Math.min(arr[1], arr[5]);
		int num=Math.max(num1, num2);
		System.out.println(num*num);
	}
}
