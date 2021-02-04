package for¹®;

import java.io.*;
import java.util.*;

public class n_15552 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine());
		
		for(int i=0; i<T; i++) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			int num1=Integer.parseInt(st.nextToken());
			int num2=Integer.parseInt(st.nextToken());
			
			bw.write((num1+num2)+"\n");
		}
		bw.flush();
		bw.close();
	}
}
