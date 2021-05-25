package ±¸Çö2;

import java.io.*;

public class n_10820 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String st=new String();
		while((st=br.readLine())!=null) {
			String[] str=st.split("");
			int U=0, L=0, N=0 ,S=0;
			for(int i=0; i<str.length; i++) {
				if(str[i].equals(" "))
					S++;
				else if(48<=str[i].charAt(0)&&57>=str[i].charAt(0))
					N++;
				else if(97<=str[i].charAt(0)&&122>=str[i].charAt(0))
					L++;
				else if(65<=str[i].charAt(0)&&90>=str[i].charAt(0))
					U++;
			}
			System.out.println(L+" "+U+" "+N+" "+S);
		}
	}
}
