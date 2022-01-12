package ±¸Çö3;

import java.util.*;

public class n_16727 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[4];
		for(int i=0; i<4; i++)
			arr[i]=sc.nextInt();
		if(arr[0]+arr[3]>arr[2]+arr[1])
			System.out.println("Persepolis");
		else if(arr[0]+arr[3]<arr[2]+arr[1])
			System.out.println("Esteghlal");
		else {
			if(arr[1]>arr[3]) System.out.println("Esteghlal");
			else if(arr[1]<arr[3]) System.out.println("Persepolis");
			else System.out.println("Penalty");
		}
	}
}
