package ¹®ÀÚ¿­;

import java.io.*;

public class n_4597 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		String st=new String();
		while(!(st=br.readLine()).equals("#")) {
			int o=0, len=st.length();
			String result="";
			for(int i=0; i<len; i++) {
				if(st.charAt(i)=='1') o++;
				if(i!=len-1) result+=st.charAt(i);
			}
			if(st.charAt(len-1)=='e'&&o%2==0||st.charAt(len-1)=='o'&&o%2==1)
				bw.write(result+"0\n");
			else bw.write(result+"1\n");
		}
		bw.flush();bw.close();
	}
}
