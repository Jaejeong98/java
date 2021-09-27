package ±¸Çö2;

import java.io.*;

public class n_2846 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine()), max=0,h=0;
		boolean b=false;
		String st[]=br.readLine().split(" ");
		int min=Integer.parseInt(st[0]);
		for(int i=1; i<T; i++) {
			if(h==Integer.parseInt(st[i]))
				min=Integer.parseInt(st[i]);
			else if(h>Integer.parseInt(st[i])) {
				max=Math.max(max,Integer.parseInt(st[i-1])-min);
				min=Integer.parseInt(st[i]);
			}
			else if(h<Integer.parseInt(st[i])&&i==T-1)
				max=Math.max(max,Integer.parseInt(st[i])-min);
			h=Integer.parseInt(st[i]);
		}
		System.out.println(max);
	}
}