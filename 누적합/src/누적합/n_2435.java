package ДЉРћЧе;

import java.io.*;
import java.util.*;

public class n_2435 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String st[]=br.readLine().split(" "), st2[]=br.readLine().split(" ");
		int n1=Integer.parseInt(st[0]), n2=Integer.parseInt(st[1]);
		int arr[]=new int[n1+1];
		for(int i=1; i<=n1; i++)
			arr[i]=Integer.parseInt(st2[i-1])+arr[i-1];
		ArrayList list=new ArrayList<Integer>();
		for(int i=n2; i<=n1; i++) 
			list.add(arr[i]-arr[i-n2]);
		Collections.sort(list);
		System.out.println(list.get(list.size()-1));
	}
}