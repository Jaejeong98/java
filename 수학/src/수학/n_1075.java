package ¼öÇÐ;

import java.util.*;

public class n_1075 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt(), F=sc.nextInt(),result;
		int num=N/100*100;
		if(num%F==0)
			result=num%100;
		else
			result=(num+(F-num%F))%100;
		if(result<10)
			System.out.println("0"+result);
		else
			System.out.println(result);
	}
}
