package Á¤·Ä;

import java.io.*;
import java.util.*;

public class n_5576 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int arr1[]=new int[10], arr2[]=new int[10], n1=0, n2=0;
		for(int i=0; i<20; i++) {
			if(i<10)
				arr1[i]=Integer.parseInt(br.readLine());
			else
				arr2[i-10]=Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		for(int i=9; i>=7; i--) {
			n1+=arr1[i];
			n2+=arr2[i];
		}
		System.out.println(n1+" "+n2);
	}
}
