package ¼öÇĞ;

import java.util.*;

public class n_2748 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int[] array=new int[num+1];
		for(int i=0; i<=num; i++) {
			if(i<2)
				array[i]=i;
			else
				array[i]=array[i-1]+array[i-2];
		}
		System.out.println(array[num]);
	}
}
