package 기본수학2;

import java.io.*;

public class n_23795 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String st=new String();
		int sum=0;
		while(!(st=br.readLine()).equals("-1")) {
			sum+=Integer.parseInt(st);
		}
		System.out.println(sum);
	}
}