package Á¤·Ä;

import java.io.*;
import java.util.*;

public class n_2693 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			String[] st=br.readLine().split(" ");
			int arr[]=new int[st.length];
			for(int j=0; j<st.length; j++)
				arr[j]=Integer.parseInt(st[j]);
			Arrays.sort(arr);
			bw.write(arr[st.length-3]+"\n");
		}
		bw.flush();bw.close();
	}
}
