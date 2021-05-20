package ±¸Çö;

import java.util.*;

public class n_1924 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]= {31,28,31,30,31,30,31,31,30,31,30,31};
		int m=sc.nextInt(), d=sc.nextInt(), num=0;
		String[] st= {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
		for(int i=0; i<m-1; i++)
			num+=arr[i];
		System.out.println(st[(num+d)%7]);
	}
}
