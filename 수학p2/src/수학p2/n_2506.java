package ¼öÇÐp2;

import java.io.*;

public class n_2506 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine()),count=0, sum=0;
		String[]st=br.readLine().split(" ");
		for(int i=0; i<n; i++) {
			if(Integer.parseInt(st[i])==0)
				count=0;
			else {
				count++;
				sum+=count;
			}
		}
		System.out.println(sum);
	}
}