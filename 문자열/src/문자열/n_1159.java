package ¹®ÀÚ¿­;

import java.io.*;

public class n_1159 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine()), arr[]=new int[26];
		for(int i=0; i<T; i++) {
			char ch=br.readLine().charAt(0);
			arr[ch-'a']++;
		}
		String st="";
		for(int i=0; i<26; i++) {
			if(arr[i]>=5)
				st+=(char)(i+'a');
		}
		if(st=="")
			System.out.println("PREDAJA");
		else
			System.out.println(st);
	}
}
