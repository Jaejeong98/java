package ¹®ÀÚ¿­;

import java.io.*;

public class n_21867 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int num=Integer.parseInt(br.readLine()), count=0;
		String st=br.readLine();
		for(int i=0; i<num; i++) {
			char ch=st.charAt(i);
			if(ch=='A'||ch=='J'||ch=='V')
				continue;
			else {
				bw.write(ch);
				count++;
			}
		}
		if(count==0)
			bw.write("nojava");
		bw.flush();bw.close();
	}
}