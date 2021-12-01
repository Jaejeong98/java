package ¼öÇÐ5p;

import java.util.*;

public class n_8710 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double arr[]=new double[3];
		for(int i=0; i<3; i++)
			arr[i]=sc.nextInt();
		int n=(int)Math.ceil((arr[1]-arr[0])/arr[2]);
		System.out.println(n);
	}
}