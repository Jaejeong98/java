package ¼öÇÐp4;

import java.io.*;
import java.util.Arrays;

public class n_7571 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] st=br.readLine().split(" ");
		int length_1=Integer.parseInt(st[0]), length_2=Integer.parseInt(st[1]);
		int[] arr1=new int[length_2], arr2=new int[length_2];
		for(int i=0; i<length_2; i++) {
			String[] st1=br.readLine().split(" ");
			arr1[i]=Integer.parseInt(st1[0]);
			arr2[i]=Integer.parseInt(st1[1]);
		}
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int sum_1=arr1[length_2/2], sum_2=arr2[length_2/2], sum=0;
		for(int i=0; i<length_2; i++)
			sum+=Math.abs(sum_1-arr1[i])+Math.abs(sum_2-arr2[i]);
		System.out.println(sum);
	}
}
