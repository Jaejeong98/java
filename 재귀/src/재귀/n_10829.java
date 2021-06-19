package Àç±Í;

import java.util.*;

public class n_10829 {
	public static void func(long num) {
		if(num!=1)
			func(num/2);
		System.out.print(num%2);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long num=sc.nextLong();
		func(num);
	}
}
