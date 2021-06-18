package ¹®ÀÚ¿­;

import java.io.*;

public class n_3059 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			String st=br.readLine();
			int sum=0, arr[]=new int[26];
			for(int j=0; j<st.length(); j++)
				arr[st.charAt(j)-65]++;
			for(int j=0; j<26; j++){
				if(arr[j]==0)
					sum+=(j+65);
			}
			bw.write(sum+"\n");
		}
		bw.flush();bw.close();
	}
}
