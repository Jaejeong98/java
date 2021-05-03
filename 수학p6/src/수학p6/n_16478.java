package ¼öÇÐp6;

import java.util.*;

public class n_16478 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double arr[]=new double[3];
		for(int i=0; i<3; i++)
			arr[i]=sc.nextDouble();
		System.out.println(String.format("%.7f",arr[0]*arr[2]/arr[1]));
	}
}
