package ¹®ÀÚ¿­;

import java.io.*;
import java.util.Arrays;

public class n_9046 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			int arr[]=new int[26];
			String st=br.readLine();
			for(int j=0; j<st.length(); j++) {
				if(st.charAt(j)!=' ')
					arr[st.charAt(j)-'a']++;
			}
			int max=0, num=0, count=0;
			for(int j=0; j<26; j++) {
				if(max<arr[j])
					max=arr[j];
			}for(int j=0; j<26; j++) {
				if(arr[j]==max) {
					count++;
					num=j;
				}
			}
			if(count==1)
				bw.write((char)(num+97)+"\n");
			else
				bw.write("?\n");
		}
		bw.flush();bw.close();
	}
}
