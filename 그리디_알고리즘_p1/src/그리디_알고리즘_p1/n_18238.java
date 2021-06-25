package 그리디_알고리즘_p1;

import java.io.*;

public class n_18238 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String st=br.readLine();
		int sum=0;
		char ch='A';
		for(int i=0; i<st.length();i++) {
			int num=Math.abs(st.charAt(i)-ch);
			sum+=Math.min(num, 26-num);
			ch=st.charAt(i);
		}
		System.out.println(sum);
	}
}