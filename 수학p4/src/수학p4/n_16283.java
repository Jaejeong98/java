package ¼öÇĞp4;

import java.util.*;

public class n_16283 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int arr[]=new int[4], count=0, answer_1=0, answer_2=0;
		for(int i=0; i<4; i++)
			arr[i]=s.nextInt();
		for(int i=1; i<arr[2]; i++) {
			int g=arr[2]-i;
			if(arr[0]*i+arr[1]*g==arr[3]) {
				count++;
				answer_1=i;
				answer_2=g;
			}
		}
		if(count==1)
			System.out.println(answer_1+" "+answer_2);
		else
			System.out.println(-1);
	}
}
