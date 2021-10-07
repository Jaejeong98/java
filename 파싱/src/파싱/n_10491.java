package ÆÄ½Ì;

import java.io.*;

public class n_10491 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String st=new String();
		while((st=br.readLine())!=null) {
			st=st.toLowerCase();
			System.out.println(st.contains("problem")?"yes":"no");
		}
	}
}