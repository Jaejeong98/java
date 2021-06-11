package ±¸Çö;

import java.util.*;

public class n_1568 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt(), i=1, count=0;
		while(num>0) {
			if(i>num)
				i=1;
			num-=i;
			i++;
			count++;
		}
		System.out.println(count);
	}
}