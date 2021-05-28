package Á¤·Ä;

import java.io.*;
import java.util.*;

public class n_10867 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine()), arr[]=new int[T];;
		String[] st=br.readLine().split(" ");
		for(int i=0; i<T; i++)
			arr[i]=Integer.parseInt(st[i]);
		Arrays.sort(arr);
		bw.write(arr[0]+" ");
		for(int i=1; i<T; i++) {
			if(arr[i]==arr[i-1])
				continue;
			else
				bw.write(arr[i]+" ");
		}
		bw.flush();
		bw.close();
	}
}
