package ±¸Çö2;

import java.io.*;

public class n_5523 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine()), counta=0, countb=0;
		for(int i=0; i<T; i++) {
			String[] st=br.readLine().split(" ");
			if(Integer.parseInt(st[0])>Integer.parseInt(st[1]))counta++;
			else if(Integer.parseInt(st[0])<Integer.parseInt(st[1])) countb++;
		}
		System.out.println(counta+" "+countb);
	}
}
