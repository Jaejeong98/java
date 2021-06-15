package ¹®ÀÚ¿­;

import java.io.*;

public class n_4740 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			String st=br.readLine();
			if(st.equals("***")) break;
			for(int i=st.length()-1; i>=0; i--)
				System.out.print(st.charAt(i));
			System.out.println("");
		}
	}
}
