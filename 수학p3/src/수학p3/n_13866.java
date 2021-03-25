package ¼öÇĞp3;

import java.util.*;

public class n_13866 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[4];
		for(int i=0; i<4; i++)
			arr[i]=sc.nextInt();
		Arrays.sort(arr);
		System.out.println((int)Math.abs(arr[3]+arr[0])-(arr[1]+arr[2]));
	}
}
