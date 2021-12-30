package ¹®ÀÚ¿­;

import java.io.*;

public class n_15814 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String st[]=br.readLine().split("");
		int T=Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			String str[]=br.readLine().split(" ");
			int n1=Integer.parseInt(str[0]), n2=Integer.parseInt(str[1]);
			String temp=st[n1];
			st[n1]=st[n2];
			st[n2]=temp;
		}
		for(int i=0; i<st.length; i++)
			System.out.print(st[i]);
	}
}