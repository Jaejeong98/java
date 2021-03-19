package ¼öÇĞp3;

import java.util.*;

public class n_16395 {
	public static int pas(int num1, int num2) {
		if(num2==1||num2==num1)
			return 1;
		else
			return pas(num1-1, num2)+pas(num1-1, num2-1);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt(), num2=sc.nextInt();
		System.out.println(pas(num1, num2));
	}
}
