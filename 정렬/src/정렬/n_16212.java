package Á¤·Ä;

import java.io.*;
import java.util.Arrays;

public class n_16212 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int t=Integer.parseInt(br.readLine()), arr[]=new int[t];
		String st[]=br.readLine().split(" ");
		for(int i=0; i<t; i++)
			arr[i]=Integer.parseInt(st[i]);
		Arrays.sort(arr);
		for(int i=0; i<t; i++)
			bw.write(arr[i]+" ");
		bw.flush();bw.close();
	}
}
