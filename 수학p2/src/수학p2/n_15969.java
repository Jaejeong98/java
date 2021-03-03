package ¼öÇÐp2;

import java.io.*;
import java.util.Arrays;

public class n_15969 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine()), sum=0;
		String[] st=br.readLine().split(" ");
		Arrays.sort(st);
		System.out.println(Integer.parseInt(st[n-1])-Integer.parseInt(st[0]));
	}
}
