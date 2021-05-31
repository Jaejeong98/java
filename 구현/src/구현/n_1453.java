package ±¸Çö;

import java.io.*;

public class n_1453 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine()), arr[]=new int[101], count=0;
		String[] st=br.readLine().split(" ");
		for(int i=0; i<T; i++) {
			if(arr[Integer.parseInt(st[i])]!=0)
				count++;
			else
				arr[Integer.parseInt(st[i])]++;
		}
		System.out.println(count);
	}
}
