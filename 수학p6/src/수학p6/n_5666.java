package ¼öÇÐp6;

import java.io.*;

public class n_5666 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String st=new String();
		while((st=br.readLine())!=null) {
			String str[]=st.split(" ");
			double n1=Double.parseDouble(str[0]), n2=Double.parseDouble(str[1]);
			System.out.println(String.format("%.2f", n1/n2));
		}
	}
}