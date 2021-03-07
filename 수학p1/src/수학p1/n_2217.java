package ¼öÇÐp1;

import java.io.*;
import java.util.Arrays;

public class n_2217 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine()), max=0;
		int[] arr=new int[T];
		for(int i=0; i<T; i++)
			arr[i]=Integer.parseInt(br.readLine());
		Arrays.sort(arr);
		for(int i=0; i<T; i++) {
			if(max<arr[i]*(T-i))
				max=arr[i]*(T-i);
		}
		System.out.println(max);
	}
}
