package Á¤·Ä;

import java.io.*;
import java.util.Arrays;

public class n_20186 {
	public static void main(String[]args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String st[]=br.readLine().split(" ");
		String str[]=br.readLine().split(" ");
		int len=Integer.parseInt(st[0]),arr[]=new int[len], sum=0;
		for(int i=0; i<len; i++)
			arr[i]=Integer.parseInt(str[i]);
		Arrays.sort(arr);
		for(int i=0; i<Integer.parseInt(st[1]); i++)
			sum+=arr[len-(i+1)]-i;
		System.out.println(sum);
	}
}
