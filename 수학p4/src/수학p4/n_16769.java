package ¼öÇÐp4;

import java.io.*;

public class n_16769 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int arr1[]=new int[3], arr2[]=new int[3];
		for(int i=0; i<3; i++) {
			String st[]=br.readLine().split(" ");
			arr1[i]=Integer.parseInt(st[0]);
			arr2[i]=Integer.parseInt(st[1]);
		}
		for(int i=1; i<=4; i++) {
			arr2[i%3]+=arr2[(i-1)%3];
			if(arr2[i%3]>arr1[i%3]) {
				arr2[(i-1)%3]=arr2[i%3]-arr1[i%3];
				arr2[i%3]=arr1[i%3];
			}else
				arr2[(i-1)%3]=0;
		}
		for(int i=0; i<3; i++)
			System.out.println(arr2[i]);
	}
}