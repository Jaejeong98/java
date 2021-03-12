package ¼öÇÐp3;

import java.io.*;
import java.util.Arrays;

public class n_2783 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		String[] st=br.readLine().split(" ");
		int x=Integer.parseInt(st[0]),  y=Integer.parseInt(st[1]);
		double price=(double)x/y*1000, min=price;
		int n=Integer.parseInt(br.readLine());
		for(int i=0; i<n; i++) {
			String[] st1=br.readLine().split(" ");
			int x1=Integer.parseInt(st1[0]), y1=Integer.parseInt(st1[1]);
			double price1=(double)x1/y1*1000;
			price=Math.min(price, price1);
		}
		bw.write(String.format("%.2f", price));
		bw.flush();
		bw.close();
	}
}