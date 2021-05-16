package Á¤·Ä;

import java.io.*;
import java.util.*;

public class n_11728 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		String[] st=br.readLine().split(" "), st1=br.readLine().split(" "), st2=br.readLine().split(" ");
		int arr[]=new int[Integer.parseInt(st[0])+Integer.parseInt(st[1])];
		for(int i=0; i<arr.length; i++) {
			if(i<st1.length)
				arr[i]=Integer.parseInt(st1[i]);
			else
				arr[i]=Integer.parseInt(st2[i-Integer.parseInt(st[0])]);
		}
		Arrays.sort(arr);
		for(int i=0; i<arr.length; i++)
			bw.write(arr[i]+" ");
		bw.flush();
		bw.close();
	}
}
