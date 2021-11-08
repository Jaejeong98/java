package ¼öÇÐp6;

import java.io.*;
import java.util.*;

public class n_23348 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String st[]=br.readLine().split(" ");
		int arr[]=new int[3], T=Integer.parseInt(br.readLine()), max=0;
		for(int i=0; i<3; i++)
			arr[i]=Integer.parseInt(st[i]);
		for(int i=0; i<T; i++) {
			int sum=0;
			for(int j=0; j<3; j++) {
				String s[]=br.readLine().split(" ");
				for(int k=0; k<3; k++)
					sum+=Integer.parseInt(s[k])*arr[k];
			}
			max=sum>max?sum:max;
		}
		System.out.println(max);
	}
}
