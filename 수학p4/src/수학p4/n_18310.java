package ¼öÇÐp4;

import java.io.*;
import java.util.*;

public class n_18310 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine()),arr[]=new int[4];;
		String[] st=br.readLine().split(" ");
		for(int i=0; i<T; i++)
			arr[i]=Integer.parseInt(st[i]);
		Arrays.sort(arr);
		if(T%2==0)
			System.out.println(arr[T/2-1]);
		else
			System.out.println(arr[T/2]);
	}
}
