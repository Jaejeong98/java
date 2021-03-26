package ¼öÇĞp4;

import java.util.*;

public class n_18301 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[3];
		for(int i=0; i<3; i++)
			arr[i]=sc.nextInt();
		System.out.println(Math.abs((arr[0]+1)*(arr[1]+1)/(arr[2]+1)-1));
	}
}
