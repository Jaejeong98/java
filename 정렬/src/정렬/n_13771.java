package Á¤·Ä;

import java.io.*;
import java.util.Arrays;

public class n_13771 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		double arr[]=new double[T];
		for(int i=0; i<T; i++)
			arr[i]=Double.parseDouble(br.readLine());
		Arrays.sort(arr);
		System.out.println(String.format("%.2f", arr[1]));
	}
}