package while¹®;

import java.io.*;
import java.util.*;

public class n_10952 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			int A=Integer.parseInt(st.nextToken()), B=Integer.parseInt(st.nextToken());
			if(A==0&&B==0)
				break;
			else 
				bw.write((A+B)+"\n");
		}
		bw.flush();
		bw.close();
	}
}
