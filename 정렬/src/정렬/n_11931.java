package Á¤·Ä;

import java.io.*;
import java.util.*;

public class n_11931 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine()), arr[]=new int[T];
		for(int i=0; i<T; i++) 
			arr[i]=Integer.parseInt(br.readLine());
		Arrays.sort(arr);
		for(int i=arr.length-1; i>=0; i--)
			bw.write(arr[i]+"\n");
		bw.flush();
		bw.close();
	}
}
