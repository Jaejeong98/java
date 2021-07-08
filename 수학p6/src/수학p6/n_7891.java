package ¼öÇÐp6;

import java.io.*;

public class n_7891 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			String st[]=br.readLine().split(" ");
			long n1=Long.parseLong(st[0]), n2=Long.parseLong(st[1]);
			System.out.println(n1+n2);
		}
	}
}
