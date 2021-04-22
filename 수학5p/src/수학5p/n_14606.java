package ¼öÇĞ5p;

import java.util.*;

public class n_14606 {
	public static int mul(int num) {
		if(num<=1)
			return 0;
		else
			return (num-1)+mul(num-1);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(mul(num));
	}
}
