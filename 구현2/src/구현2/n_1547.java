package ±¸Çö2;

import java.io.*;

public class n_1547 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine()), b=1;
		for(int i=0; i<T; i++) {
			String st[]=br.readLine().split(" ");
			if(st[0].equals(Integer.toString(b)))
				b=Integer.parseInt(st[1]);
			else if(st[1].equals(Integer.toString(b)))
				b=Integer.parseInt(st[0]);
		}
		System.out.println(b);
	}
}
