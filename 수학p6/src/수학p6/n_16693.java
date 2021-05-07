package ¼öÇÐp6;

import java.util.*;

public class n_16693 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double[] arr=new double[4];
		for(int i=0; i<4; i++)
			arr[i]=sc.nextDouble();
		double d1=arr[0]/arr[1], d2=arr[2]*arr[2]*Math.PI/arr[3];
		if(d1<d2)
			System.out.println("Whole pizza");
		else
			System.out.println("Slice of pizza");
	}
}
