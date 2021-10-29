package ±¸Çö2;

import java.io.*;

public class n_16396 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine()), count=0;
		boolean b[]=new boolean[10001];
		for(int i=0; i<T; i++) {
			String st[]=br.readLine().split(" ");
			int n1=Integer.parseInt(st[0]), n2=Integer.parseInt(st[1]);
			for(int j=n1; j<n2; j++) {
				if(!b[j]) {
					b[j]=true;
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
