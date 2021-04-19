package ¼öÇÐ5p;

import java.util.*;

public class n_20499 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] st=sc.nextLine().split("/");
		int[] arr=new int[3];
		for(int i=0; i<3; i++)
			arr[i]=Integer.parseInt(st[i]);
		if(arr[0]+arr[2]<arr[1]||arr[1]==0)
			System.out.println("hasu");
		else
			System.out.println("gosu");
	}
}
