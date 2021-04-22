package ¼öÇĞ5p;

import java.io.*;

public class n_9437 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		while(true){
			String st=br.readLine();
			if(st.equals("0"))
				break;
			String[] st1=st.split(" ");
			int num1=Integer.parseInt(st1[0]), num2=Integer.parseInt(st1[1]);
			if(num2%2==0) {
				if(num1/2>=num2)
					bw.write((num2-1)+" "+(num1-num2+1)+" "+(num1-num2+2)+"\n");
				else
					bw.write((num1-num2+1)+" "+(num1-num2+2)+" "+(num2-1)+"\n");
			}
			else {
				if(num1/2>=num2)
					bw.write((num2+1)+" "+(num1-num2)+" "+(num1-num2+1)+"\n");
				else
					bw.write((num1-num2)+" "+(num1-num2+1)+" "+(num2+1)+"\n");
			}
		}
		bw.flush();
		bw.close();
	}
}
