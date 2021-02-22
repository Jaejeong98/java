package 정렬;

import java.io.*;

public class n_2750 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine()), num=0;
		int[] arr=new int[n];
		for(int i=0; i<n; i++)
			arr[i]=Integer.parseInt(br.readLine());
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(arr[i]>arr[j]) {
					num=arr[j];
					arr[j]=arr[i];
					arr[i]=num;
				}
			}
		}
		for(int i=0; i<n; i++)
			System.out.println(arr[i]);
	}
}
//버블정렬