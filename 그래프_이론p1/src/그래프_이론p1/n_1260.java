package 그래프_이론p1;

import java.util.*;
import java.io.*;

public class n_1260 {
	public static int arr[][];
	public static boolean b[];
	public static void bfs(int n) {
		Queue<Integer>queue=new LinkedList<Integer>();
		queue.add(n);
		b[n]=true;
		System.out.print(n+" ");
		while(!queue.isEmpty()) {
			int num=queue.peek();
			queue.poll();
			for(int i=1; i<arr.length; i++) {
				if(arr[num][i]==1&&b[i]==false) {
					queue.add(i);
					b[i]=true;
					System.out.print(i+" ");
				}
			}
		}
	}
	public static void dfs(int n) {
		b[n]=true;
		System.out.print(n+" ");
		if(n==arr.length) return;
		for(int i=1; i<arr.length; i++) {
			if(arr[n][i]==1&&b[i]==false) dfs(i);
		}
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String st[]=br.readLine().split(" ");
		int n=Integer.parseInt(st[0]), m=Integer.parseInt(st[1]),v=Integer.parseInt(st[2]);
		arr=new int[n+1][n+1];
		for(int i=0; i<m; i++) {
			String str[]=br.readLine().split(" ");
			int n1=Integer.parseInt(str[0]),n2=Integer.parseInt(str[1]); 
			arr[n1][n2]=arr[n2][n1]=1;
		}
		b=new boolean[n+1];
		dfs(v);
		System.out.println();
		b=new boolean[n+1];
		bfs(v);
	}
}