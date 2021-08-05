package ±¸Çö2;

import java.io.*;
import java.util.*;

public class n_5176 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			String st[]=br.readLine().split(" ");
			int count=0, arr[]=new int[Integer.parseInt(st[1])+1];
			for(int j=0; j<Integer.parseInt(st[0]); j++) {
				int num=Integer.parseInt(br.readLine());
				if(arr[num]!=0) count++;
				else arr[num]++;
			}
			bw.write(count+"\n");
		}
		bw.flush();bw.close();
	}
}
