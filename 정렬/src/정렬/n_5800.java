package Á¤·Ä;

import java.io.*;
import java.util.Arrays;

public class n_5800 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			String st[]=br.readLine().split(" ");
			int arr[]=new int[Integer.parseInt(st[0])], max=0;
			for(int j=1; j<=arr.length; j++)
				arr[j-1]=Integer.parseInt(st[j]);
			Arrays.sort(arr);
			for(int j=1; j<arr.length; j++){
				if(max<arr[j]-arr[j-1])
					max=arr[j]-arr[j-1];
			}
			bw.write("Class "+(i+1)+"\n"+"Max "+arr[arr.length-1]+", Min "+arr[0]+", Largest gap "+max+"\n");
		}
		bw.flush();bw.close();
	}
}
