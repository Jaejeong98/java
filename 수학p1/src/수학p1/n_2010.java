package ¼öÇÐp1;

import java.io.*;

public class n_2010 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine()), sum=0;
		for(int i=0; i<num; i++)
			sum+=Integer.parseInt(br.readLine());
		System.out.println(sum-(num-1));
	}
}
