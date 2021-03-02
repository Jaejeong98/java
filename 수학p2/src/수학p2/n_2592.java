package ¼öÇÐp2;

import java.io.*;

public class n_2592 {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int sum=0, max=0, max_n=0;
		int[] arr=new int[101];
		for(int i=0; i<10; i++) {
			int num=Integer.parseInt(br.readLine())/10;
			sum+=num;
			arr[num]++;
		}
		for(int i=0; i<arr.length; i++) {
			if(max<arr[i]) {
				max=arr[i];
				max_n=i;
			}
		}
		System.out.println(sum+"\n"+max_n*10);
	}
}
