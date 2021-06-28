package ¹®ÀÚ¿­;

import java.io.*;

public class n_5704 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		String st=new String();
		while((st=br.readLine()).equals("*")==false) {
			int arr[]=new int[26];
			boolean b=false;
			for(int i=0; i<st.length(); i++) {
				if(st.charAt(i)==' ')
					continue;
				else
					arr[st.charAt(i)-'a']++;
			}
			for(int i=0; i<26; i++) {
				if(arr[i]==0) {
					b=true;
					break;
				}
			}
			bw.write(b==true?"N\n":"Y\n");
		}
		bw.flush();bw.close();
	}
}
