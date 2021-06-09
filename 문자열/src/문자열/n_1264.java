package ¹®ÀÚ¿­;

import java.io.*;

public class n_1264 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		while(true) {
			String st=br.readLine();
			if(st.equals("#")) break;
			int count=0;
			for(int i=0; i<st.length(); i++) {
				char ch=st.charAt(i);
				if(ch>=65&&ch<=90)
					ch+=32;
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
	        		count++;
			}
			bw.write(count+"\n");
		}
		bw.flush();bw.close();
	}
}
