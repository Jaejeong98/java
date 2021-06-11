package Á¤·Ä;

import java.io.*;
import java.util.Arrays;

public class n_15688 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T=Integer.parseInt(br.readLine()), arr[]=new int[T];
		for(int i=0; i<T; i++)
			arr[i]=Integer.parseInt(br.readLine());
		Arrays.sort(arr);
		for(int i=0; i<T; i++)
			sb.append(arr[i]).append('\n');
		System.out.println(sb);
	}
}