package ¼öÇĞp6;

import java.io.*;

public class n_12755 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine()), i=0;
		while(num>0) {
			i++;
			int count=i, n=0;
			while(count>0) {
				n++;
				count/=10;
			}
			num-=n;
		}
		int re=Math.abs(num), sum=0;
		for(int j=0; j<=re; j++) {
			sum=i%10;
			i/=10;
		}
		System.out.println(sum);
	}
}