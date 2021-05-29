package ¹®ÀÚ¿­;

import java.io.*;

public class n_11365 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		while(true) {
			String st=br.readLine();
			if(st.equals("END"))
				break;
			String[] str=st.split(" ");
			for(int i=str.length-1; i>=0; i--) {
				for(int j=str[i].length()-1; j>=0; j--)
					bw.write(str[i].charAt(j));
				bw.write(" ");
			}
			bw.write("\n");
		}
		bw.flush();bw.close();
	}
}