package ¼öÇÐ5p;

import java.io.*;

public class n_11772 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine()), sum=0;
		for(int i=0; i<T; i++) {
			int num=Integer.parseInt(br.readLine());
			sum+=(int)Math.pow(num/10, num%10);
		}
		System.out.println(sum);
	}
}
