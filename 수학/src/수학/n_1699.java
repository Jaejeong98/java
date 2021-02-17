package ¼öÇÐ;

import java.util.*;

public class n_1699 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int[] array=new int[100001];
		for(int i=1; i<=3;i++)
			array[i]=i;
		for(int i=4; i<=num; i++) {
			int min=100;
			for(int j=(int)Math.sqrt(i); j>1;j--) {
				if((j*j)<=i) {
					int cnt=1+array[i-(j*j)];
					if(cnt<min) {
						min=cnt;
						array[i]=min;
					}
				}
			}
		}
		System.out.println(array[num]);
	}
}
