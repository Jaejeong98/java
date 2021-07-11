package 그리디_알고리즘_p1;

import java.io.*;
import java.util.*;

public class n_13164 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String st[]=br.readLine().split(" "), str[]=br.readLine().split(" ");
		int arr[]=new int[Integer.parseInt(st[0])], arr2[]=new int[Integer.parseInt(st[0])-1];
		for(int i=0; i<Integer.parseInt(st[0]); i++)
			arr[i]=Integer.parseInt(str[i]);
		for(int i=1; i<Integer.parseInt(st[0]); i++)
			arr2[i-1]=arr[i]-arr[i-1];
		Arrays.sort(arr2);
		int count=0;
		for(int i=0; i<Integer.parseInt(st[0])-Integer.parseInt(st[1]);i++)
			count+=arr2[i];
		System.out.println(count);
	}
}
