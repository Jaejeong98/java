package ½Ã¹Ä·¹ÀÌ¼Ç;

import java.io.*;

public class n_20361 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String st[]=br.readLine().split(" ");
		boolean b[]=new boolean[Integer.parseInt(st[0])+1];
		b[Integer.parseInt(st[1])]=true;
		int j=Integer.parseInt(st[1]);
		for(int i=0; i<Integer.parseInt(st[2]); i++) {
			String str[]=br.readLine().split(" ");
			int n1=Integer.parseInt(str[0]), n2=Integer.parseInt(str[1]);
			if(b[n1]) {b[n2]=true; b[n1]=false; j=n2;}
			else if(b[n2]){b[n1]=true; b[n2]=false; j=n1;}
		}
		System.out.print(j);
	}
}