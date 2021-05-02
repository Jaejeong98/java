package ¼öÇÐp6;

import java.io.*;
import java.util.*;

public class n_14241 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine()), arr[]=new int[T];
		String[] num=br.readLine().split(" ");
		for(int i=0; i<T; i++)
			arr[i]=Integer.parseInt(num[i]);
		Arrays.sort(arr);
		int result=0, size=arr[T-1];
		for(int i=T-1; i>0; i--) {
			result+=size*arr[i-1];
			size+=arr[i-1];
		}
		System.out.println(result);
	}
}
