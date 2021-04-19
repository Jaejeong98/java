package ¼öÇĞ5p;

import java.util.*;

public class n_5928 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[3];
		for(int i=0; i<3; i++)
			arr[i]=sc.nextInt();
		int T1=arr[0]*24*60+arr[1]*60+arr[2];
		int T2=11*24*60+60*11+11;
		if(T1<T2)
			System.out.println(-1);
		else
			System.out.println(T1-T2);
	}
}
