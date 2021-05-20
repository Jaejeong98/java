package ±¸Çö;

import java.util.*;

public class n_1475 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] st=sc.nextLine().split("");
		int arr[]=new int[10];
		for(int i=0; i<st.length; i++)
			arr[Integer.parseInt(st[i])]++;
		arr[6]=(int)Math.ceil((double)(arr[6]+arr[9])/2);
		arr[9]=0;
		Arrays.sort(arr);
		System.out.println(arr[9]);
	}
}
