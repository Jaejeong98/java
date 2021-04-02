package ¼öÇĞp4;

import java.util.*;

public class n_12756 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[4];
		for(int i=0; i<4; i++)
			arr[i]=sc.nextInt();
		while(true) {
			arr[3]-=arr[0];
			arr[1]-=arr[2];
			if(arr[1]<1||arr[3]<1)
				break;
		}
		if(arr[1]<1&&arr[3]<1)
			System.out.println("DRAW");
		else if(arr[1]<arr[3])
			System.out.println("PLAYER B");
		else
			System.out.println("PLAYER A");
	}
}
