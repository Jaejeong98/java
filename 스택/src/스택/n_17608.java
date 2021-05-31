package Ω∫≈√;

import java.io.*;

public class n_17608 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine()), arr[]=new int[T];
		for(int i=0; i<T; i++)
			arr[i]=Integer.parseInt(br.readLine());
		int max=arr[T-1], count=1;
		for(int i=T-1; i>=0; i--) {
			if(arr[i]>max) {
				count++;
				max=arr[i];
			}
		}
		System.out.println(count);
	}
}
