package ¹®ÀÚ¿­;

import java.io.*;
import java.util.Arrays;

public class n_11091 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			int arr[]=new int[26];
			String st=br.readLine(), result="";
			for(int j=0;j<st.length(); j++) {
				char ch=st.charAt(j);
				int num=0;
				if(st.charAt(j)>='a'&&st.charAt(j)<='z')
					arr[(int)(st.charAt(j)-'a')]++;
				else if(st.charAt(j)>='A'&&st.charAt(j)<='Z')
                    arr[(int)(st.charAt(j)-'A')]++;
			}
			boolean t=true;
			for(int j=0; j<26; j++) {
				if(arr[j]==0) {
					t=false;
					result+=(char)(j+'a');
				}
			}
			if(t) bw.write("pangram\n");
			else bw.write("missing "+result+"\n");
		}
		bw.flush();bw.close();
	}
}