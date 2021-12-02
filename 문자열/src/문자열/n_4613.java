package ¹®ÀÚ¿­;

import java.io.*;

public class n_4613 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		String st=new String();
		while(!(st=br.readLine()).equals("#")) {
			int sum=0;
			for(int i=0; i<st.length(); i++) {
				int n=st.charAt(i)==' '?0:(st.charAt(i)-'A')+1;
				sum+=n*(i+1);
			}
			bw.write(sum+"\n");
		}
		bw.flush();bw.close();
	}
}