package ¹®ÀÚ¿­;

import java.io.*;

public class n_11720 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		String st=br.readLine();
		int sum=0;
		for(int i=0; i<N; i++) {
			char ch=st.charAt(i);
			int num=Character.getNumericValue(ch);
			sum+=num;
		}
		System.out.println(sum);
	}
}
