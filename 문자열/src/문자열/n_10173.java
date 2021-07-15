package ¹®ÀÚ¿­;

import java.io.*;

public class n_10173 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		String st=new String();
		while((st=br.readLine()).equals("EOI")==false) {
			if(st.toLowerCase().contains("nemo"))
				bw.write("Found\n");
			else
				bw.write("Missing\n");
		}
		bw.flush();bw.close();
	}
}
