package ±¸Çö2;

import java.io.*;
import java.util.Arrays;

public class n_16546 {
	public static void main(String[]args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine()),arr[]=new int[T],num=0;
		String[] st=br.readLine().split(" ");
		for(int i=1; i<T; i++)
			arr[i]=Integer.parseInt(st[i-1]);
		Arrays.sort(arr);
		for(int i=1; i<T; i++) {
			if(i!=arr[i]) {
				num=i;
				break;
			}
		}
		System.out.println(num==0?T:num);
	}
}
