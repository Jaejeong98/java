package ¼öÇÐp6;

import java.io.*;

public class n_13484 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine());
		int T=Integer.parseInt(br.readLine()), sum=0;
		for(int i=0; i<T; i++)
			sum+=Integer.parseInt(br.readLine());
		System.out.println(num*(T+1)-sum);
	}
}
