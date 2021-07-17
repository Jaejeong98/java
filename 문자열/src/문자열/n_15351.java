package ¹®ÀÚ¿­;

import java.io.*;

public class n_15351 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			int arr[]=new int[26], sum=0;
			String st=br.readLine();
			for(int j=0; j<st.length(); j++) {
				if(st.charAt(j)==' ')
					continue;
				else
				sum+=st.charAt(j)-'A'+1;
			}
			bw.write(sum==100?"PERFECT LIFE\n":sum+"\n");
		}
		bw.flush();bw.close();
	}
}
