package ±¸Çö2;

import java.io.*;

public class n_5635 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		String st[]=br.readLine().split(" "), st2[]=st;
		for(int i=0; i<T-1; i++) {
			String st3[]=br.readLine().split(" ");
			int num1=Integer.parseInt(st3[3]);
			if(num1<Integer.parseInt(st[3]))
				st=st3;
			else if(num1==Integer.parseInt(st[3])) {
				if(Integer.parseInt(st3[2])<Integer.parseInt(st[2]))
					st=st3;
				else if(Integer.parseInt(st3[2])==Integer.parseInt(st[2])) {
					if(Integer.parseInt(st3[1])<Integer.parseInt(st[1]))
						st=st3;
				}
			}
			if(num1>Integer.parseInt(st2[3]))
				st2=st3;
			else if(num1==Integer.parseInt(st2[3])) {
				if(Integer.parseInt(st3[2])<Integer.parseInt(st2[2]))
					st2=st3;
				else if(Integer.parseInt(st3[2])==Integer.parseInt(st2[2])) {
					if(Integer.parseInt(st3[1])<Integer.parseInt(st2[1]))
						st2=st3;
				}
			}
		}
		System.out.println(st2[0]+"\n"+st[0]);
	}
}
