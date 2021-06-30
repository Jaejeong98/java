package ±¸Çö2;

import java.io.*;

public class n_2083 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		String st=new String();
		while((st=br.readLine()).equals("# 0 0")==false) {
			String str[]=st.split(" ");
			bw.write(Integer.parseInt(str[1])>=18||Integer.parseInt(str[2])>=80?str[0]+" Senior\n":str[0]+" Junior\n");
		}
		bw.flush();bw.close();
	}
}
