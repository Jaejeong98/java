package ¼öÇÐp3;

import java.io.*;
import java.util.Arrays;

public class n_15781 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] st1=br.readLine().split(" "), st2=br.readLine().split(" "), st3=br.readLine().split(" ");
		int arr2[]=new int[st2.length], arr3[]=new int[st3.length];
		for(int i=0; i<st2.length; i++)
			arr2[i]=Integer.parseInt(st2[i]);
		for(int i=0; i<st3.length; i++)
			arr3[i]=Integer.parseInt(st3[i]);
		Arrays.sort(arr2);
		Arrays.sort(arr3);
		System.out.println(arr2[arr2.length-1]+arr3[arr3.length-1]);
	}
}
