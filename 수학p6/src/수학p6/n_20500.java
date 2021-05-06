package ¼öÇÐp6;

import java.util.*;

public class n_20500 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		long re=1000000007;
		if (num == 1) {
		      System.out.println(0);
		      return;
		}
		long[][] arr = new long[3][num + 1];
		arr[0][2]=arr[1][2]=1;
		for (int i = 3; i <= num; i++) {
			arr[0][i] = (arr[1][i - 1] + arr[2][i - 1]) % re;
		    arr[1][i] = (arr[0][i - 1] + arr[2][i - 1]) % re;
		    arr[2][i] = (arr[0][i - 1] + arr[1][i - 1]) % re;
		}
		System.out.println(arr[0][num]);
	}
}
