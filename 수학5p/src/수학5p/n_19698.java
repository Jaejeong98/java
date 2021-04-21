package ¼öÇĞ5p;

import java.util.*;

public class n_19698 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[4];
		for(int i=0; i<4; i++)
			arr[i]=sc.nextInt();
		int max=(int) ((Math.floor((double)arr[1]/arr[3]))*Math.floor((double)arr[2]/arr[3]));
		if(max>arr[0])
			System.out.println(arr[0]);
		else
			System.out.println(max);
	}
}
