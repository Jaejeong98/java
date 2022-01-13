package ¼öÇÐp6;

import java.util.*;

public class n_15128 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long arr[]=new long[4];
		for(int i=0; i<4; i++)
			arr[i]=sc.nextLong();
		System.out.print(arr[0]*arr[2]%(arr[1]*arr[3]*2)==0?1:0);
	}
}
