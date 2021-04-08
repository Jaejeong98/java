package ÀüÃ¼;

import java.io.*;

public class n_1003 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine());
		int[] arr=new int[T];
		for(int i=0; i<T; i++)
			arr[i]=Integer.parseInt(br.readLine());
		int[] z=new int[41], o=new int[41];
		z[0]=1;
		z[1]=0;
		o[0]=0;
		o[1]=1;
		for(int i=2; i<41; i++) {
			z[i]=z[i-1]+z[i-2];
			o[i]=o[i-1]+o[i-2];
		}
		for(int i=0; i<T; i++)
			bw.write(z[arr[i]]+" "+o[arr[i]]+"\n");
		bw.flush();
		bw.close();
	}
}
