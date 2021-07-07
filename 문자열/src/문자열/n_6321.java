package ¹®ÀÚ¿­;

import java.io.*;

public class n_6321 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			String st=br.readLine(), result="";
			for(int j=0; j<st.length(); j++) {
				if(st.charAt(j)=='Z')
					result+='A';
				else 
					result+=(char)(st.charAt(j)+1);
			}
			bw.write("String #"+(i+1)+"\n"+result+"\n\n");
		}
		bw.flush();bw.close();
	}
}
