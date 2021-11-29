package ¼öÇÐp3;

import java.io.*;
import java.util.Arrays;

public class n_23292 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String st[]=br.readLine().split("");
		int T=Integer.parseInt(br.readLine()), arr[]=new int[T], max=0,o=0;
		for(int i=0; i<T; i++) 
			arr[i]=Integer.parseInt(br.readLine());
		Arrays.sort(arr);
		for(int i=0; i<T; i++) {
			String s[]=Integer.toString(arr[i]).split("");
			int arr2[]=new int[3];
			for(int j=0; j<8; j++) {
				if(j<4) arr2[0]+=Math.pow(Integer.parseInt(s[j])-Integer.parseInt(st[j]), 2);
				else if(j<6) arr2[1]+=Math.pow(Integer.parseInt(s[j])-Integer.parseInt(st[j]), 2);
				else arr2[2]+=Math.pow(Integer.parseInt(s[j])-Integer.parseInt(st[j]), 2);
			}
			int re=arr2[0]*arr2[1]*arr2[2];
			if(re>max) {o=i; max=re;}
		}
		System.out.println(arr[o]);
	}
}