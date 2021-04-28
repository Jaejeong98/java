package ¼öÇÐp4;

import java.util.*;

public class n_16561 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt(), sum=1, count=2;
		for(int i=9; i<num; i+=3) {
			sum+=count;
			count++;
		}
		System.out.println(sum);
	}
}
