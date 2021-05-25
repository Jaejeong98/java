package ¼öÇÐp2;

import java.util.*;

public class n_2476 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt(), m[]=new int[T];
		for(int i=0; i<T; i++) {
			int arr[]=new int[3];
			for(int j=0; j<3; j++)
				arr[j]=sc.nextInt();
			Arrays.sort(arr);
			if(arr[0]==arr[1]&&arr[1]==arr[2])
				m[i]=10000+arr[0]*1000;
			else if(arr[0]!=arr[1]&&arr[1]!=arr[2]&&arr[2]!=arr[0])
				m[i]=arr[2]*100;
			else
				m[i]=1000+arr[1]*100;
		}
		Arrays.sort(m);
		System.out.println(m[T-1]);
	}
}
