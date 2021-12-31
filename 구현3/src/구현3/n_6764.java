package ±¸Çö3;

import java.util.*;

public class n_6764 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[4], c=0;
		for(int i=0; i<4; i++)
			arr[i]=sc.nextInt();
		for(int i=0; i<3; i++) {
			if(arr[i]<arr[i+1])
				c+=1;
			else if(arr[i]>arr[i+1])
				c+=4;
			else if(arr[i]==arr[i+1])
				c-=1;
			else
				c+=8;
		}
		if(c==3) System.out.println("Fish Rising");
		else if(c==12) System.out.println("Fish Diving");
		else if(c==-3) System.out.println("Fish At Constant Depth");
		else System.out.println("No Fish");
	}
}
