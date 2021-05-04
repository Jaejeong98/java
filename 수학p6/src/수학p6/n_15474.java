package ¼öÇÐp6;

import java.util.*;

public class n_15474 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double arr[]=new double[5];
		for(int i=0; i<arr.length; i++)
			arr[i]=sc.nextDouble();
		int num1=(int) (Math.ceil(arr[0]/arr[1])*arr[2]);
		int num2=(int) (Math.ceil(arr[0]/arr[3])*arr[4]);
		System.out.println(num1<num2?num1:num2);
	}
}
