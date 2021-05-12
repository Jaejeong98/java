package ±¸Çö;

import java.io.*;

public class n_1259 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		while(true) {
			String st=br.readLine(), newst=new String();
			if(st.equals("0"))
				break;
			String[] str=st.split("");
			for(int i=str.length-1; i>=0; i--)
				newst+=str[i];
			if(st.equals(newst))
				bw.write("yes\n");
			else
				bw.write("no\n");
		}
		bw.flush();bw.close();
	}
}
