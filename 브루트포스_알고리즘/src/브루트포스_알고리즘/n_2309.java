package 브루트포스_알고리즘;

import java.io.*;
import java.util.Arrays;

public class n_2309 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int arr[]=new int[9], sum=0;
		boolean b=false;
		for(int i=0; i<9; i++) {
			arr[i]=Integer.parseInt(br.readLine());
			sum+=arr[i];
		}
		for(int i=0;i<9;i++) {
			if(b)break;
			for(int j=0;j<9;j++) {
				if(i==j)continue;
				if(sum-arr[j]-arr[i]==100) {
					arr[i]=0;arr[j]=0;
					b=true;
					break;
				}
			}
		}
		Arrays.sort(arr);
		for(int i =0;i<9;i++)
			if(arr[i]!=0)System.out.println(arr[i]);
	}
}
