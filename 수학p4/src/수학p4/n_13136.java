package ¼öÇÐp4;

import java.util.*;

public class n_13136 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long[] arr=new long[3];
		for(int i=0; i<3; i++)
			arr[i]=sc.nextLong();
		long num1=(long)Math.ceil((double)arr[0]/arr[2]),
				num2=(long)Math.ceil((double)arr[1]/arr[2]);
		System.out.println(num1*num2);
	}
}
