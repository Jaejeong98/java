package ¼öÇĞp6;

import java.util.*;

public class n_19602 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[3], s=0;
		for(int i=0; i<3; i++)
			s+=sc.nextInt()*(i+1);
		System.out.println(s>=10?"happy":"sad");
	}
}