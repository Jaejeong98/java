package 그리디_알고리즘_p1;

import java.io.*;
import java.util.*;

public class n_16435 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String st[]=br.readLine().split(" "),st2[]=br.readLine().split(" ");
		int n1=Integer.parseInt(st[0]), n2=Integer.parseInt(st[1]), arr[]=new int[n1];
		for(int i=0; i<n1; i++)
			arr[i]=Integer.parseInt(st2[i]);
		Arrays.sort(arr);
		for(int i=0; i<n1; i++) {
			if(arr[i]<=n2)
				n2++;
			else break;
		}
		System.out.println(n2);
	}
}
