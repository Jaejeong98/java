package ¼öÇĞp4;

import java.util.*;

public class n_2991 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[7], res=new int[3];
		for(int i=0; i<7; i++)
			arr[i]=sc.nextInt();
		int b1=arr[0]+arr[1], b2=arr[2]+arr[3];
		for(int i=4; i<7; i++) {
			int d1=arr[i]%b1, d2=arr[i]%b2;
			if(d1<=arr[0]&&d1!=0)
				res[i-4]++;
			if(d2<=arr[2]&&d2!=0)
				res[i-4]++;
		}
		for(int i=0; i<3; i++)
			System.out.println(res[i]);
	}
}
