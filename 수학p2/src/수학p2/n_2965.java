package ¼öÇĞp2;

import java.util.*;

public class n_2965 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[3], count=0;
		for(int i=0; i<3; i++)
			arr[i]=sc.nextInt();
		while(true) {
			if(arr[1]-arr[0]>arr[2]-arr[1])
				arr[2]=arr[1]-1;
			else
				arr[0]=arr[1]+1;
			Arrays.sort(arr);
			if(arr[1]==arr[0]||arr[1]==arr[2])
				break;
			count++;
		}
		System.out.println(count);
	}
}
