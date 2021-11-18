package 그리디_알고리즘_p1;

import java.io.*;
import java.util.Arrays;

public class n_12788 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine()), arr[]=new int[T];
		String st[]=br.readLine().split(" "), st2[]=br.readLine().split(" ");
		int p=Integer.parseInt(st[0])*Integer.parseInt(st[1]), sum=0;
		for(int i=0; i<T; i++)
			arr[i]=Integer.parseInt(st2[i]);
		Arrays.sort(arr);
		boolean b=false;
		for(int i=T-1; i>=0; i--) {
			sum+=arr[i];
			if(sum>=p) {
				System.out.println(T-i);
				b=true;
				break;
			}
		}
		if(!b) System.out.println("STRESS");
	}
}