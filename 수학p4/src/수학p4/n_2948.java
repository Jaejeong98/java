package ¼öÇĞp4;

import java.util.*;

public class n_2948 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr= {31,28,31,30,31,30,31,31,30,31,30,31};
		String[] day= {"Wednesday", "Thursday", "Friday", "Saturday", "Sunday", "Monday", "Tuesday"};
		int d=sc.nextInt(), m=sc.nextInt(), sum=0;
		for(int i=0; i<m-1; i++)
			sum+=arr[i];
		System.out.println(day[(sum+d)%7]);
	}
}
