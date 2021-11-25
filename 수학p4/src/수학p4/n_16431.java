package ¼öÇĞp4;

import java.util.*;

public class n_16431 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[6];
		for(int i=0; i<6; i++)
			arr[i]=sc.nextInt();
		for(int i=0; i<4; i++) {
			if(i%2==0) arr[i]=Math.abs(arr[i]-arr[4]);
			else arr[i]=Math.abs(arr[i]-arr[5]);
		}
		int b=Math.min(arr[0], arr[1])+Math.abs(arr[0]-arr[1]), d=arr[2]+arr[3];
		if(b==d) System.out.print("tie");
		else System.out.println(b>d?"daisy":"bessie");
	}
}