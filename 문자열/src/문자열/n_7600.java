package ¹®ÀÚ¿­;

import java.io.*;

public class n_7600 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String st=new String();
		while((st=br.readLine()).equals("#")==false) {
			int arr[]=new int[26], count=0;
			for(int i=0; i<st.length(); i++) {
				if(st.charAt(i)>='A'&&st.charAt(i)<='Z')
					arr[st.charAt(i)-65]++;
				else if(st.charAt(i)>='a'&&st.charAt(i)<='z')
					arr[st.charAt(i)-97]++;
				else
					continue;
			}
			for(int i=0; i<26; i++) {
				if(arr[i]!=0)
					count++;
			}
			System.out.println(count);
		}
	}
}
