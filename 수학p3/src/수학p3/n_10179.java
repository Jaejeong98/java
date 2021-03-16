package ¼öÇÐp3;

import java.io.*;
import java.util.Locale;

public class n_10179 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int num=Integer.parseInt(br.readLine());
		for(int i=0; i<num; i++) {
			double price=Double.parseDouble(br.readLine());
			bw.write(String.format(Locale.getDefault(),"$%.2f\n", price*0.8));
		}
		bw.flush();
		bw.close();
	}
}
