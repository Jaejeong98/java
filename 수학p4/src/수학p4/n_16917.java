package ¼öÇÐp4;

import java.util.*;

public class n_16917 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long arr[]=new long[5];
		for(int i=0; i<5; i++)
			arr[i]=sc.nextLong();
		long min=Math.min(arr[3], arr[4]);
		long answer=Math.min(arr[0]*(arr[3]-min)+arr[1]*(arr[4]-min), 
				arr[2]*2*Math.max(arr[3]-min, arr[4]-min));
		if(arr[1]+arr[0]>arr[2]*2)
			answer+=min*2*arr[2];
		else
			answer+=arr[0]*min+arr[1]*min;
		System.out.println(answer);
	}
}
