package ¼öÇÐp6;

import java.io.*;

public class n_9950 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		String st=new String();
		while(!(st=br.readLine()).equals("0 0 0")) {
			String str[]=st.split(" ");
			int n1=Integer.parseInt(str[0]),n2=Integer.parseInt(str[1]),n3=Integer.parseInt(str[2]);
			if(n3==0) bw.write(n1+" "+n2+" "+n1*n2);
			else if(n2==0) bw.write(n1+" "+n3/n1+" "+n3);
			else bw.write(n3/n2+" "+n2+" "+n3);
			bw.write("\n");
		}
		bw.flush();bw.close();
	}
}