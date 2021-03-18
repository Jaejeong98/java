package ¼öÇĞp3;

import java.io.*;

public class n_2485 {
	public static int gcd(int num1, int num2) {
		if(num2==0)
			return num1;
		else
			return gcd(num2, num1%num2);
	}
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine());
		int[] arr=new int[num];
		for(int i=0; i<num; i++)
			arr[i]=Integer.parseInt(br.readLine());
		int gcd=arr[1]-arr[0], sum=0;
		for(int i=2; i<num; i++)
			gcd=gcd(gcd, arr[i]-arr[i-1]);
		for(int i=1; i<num; i++)
			sum+=(arr[i]-arr[i-1])/gcd-1;
		System.out.println(sum);
	}
}
