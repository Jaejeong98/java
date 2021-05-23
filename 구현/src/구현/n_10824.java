package ±¸Çö;

import java.util.*;

public class n_10824 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String arr[]=new String[4];
		for(int i=0; i<4; i++)
			arr[i]=sc.next();
		String num1=arr[0]+""+arr[1], num2=arr[2]+""+arr[3];
		long sum=Long.parseLong(num1)+Long.parseLong(num2);
		System.out.println(sum);
	}
}
