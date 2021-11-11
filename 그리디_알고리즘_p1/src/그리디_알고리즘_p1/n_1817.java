package 그리디_알고리즘_p1;

import java.io.*;
import java.util.Arrays;

public class n_1817 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String st[]=br.readLine().split(" ");
		int T=Integer.parseInt(st[0]), w=Integer.parseInt(st[1]), arr[]=new int[T], c=0, j=0;
		if(T==0) System.out.println(0);
		else {
			String st2[]=br.readLine().split(" ");
			for(int i=0; i<T; i++) {
				if(arr[j]+Integer.parseInt(st2[i])>w) {
					c++;j++;
					arr[j]+=Integer.parseInt(st2[i]);
				}
				else arr[j]+=Integer.parseInt(st2[i]);
			}
			System.out.println(c+1);
		}
	}
}