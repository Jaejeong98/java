package 너비우선탐색;

import java.util.*;
import java.io.*;

class pair{
	int x, y;
	pair(int x,int y){
		this.x=x;
		this.y=y;
	}
}

public class n_1012 {
	public static int n1, n2;
	public static int arr[][];
	public static boolean b[][];
	public static int dx[]= {-1,0,1,0};
	public static int dy[]= {0,-1,0,1};
	public static void bfs(int n, int m) {
		Queue<pair> queue=new LinkedList<>();
		queue.add(new pair(n,m));
		while(!queue.isEmpty()) {
			pair d=queue.poll();
			for(int i=0; i<4; i++) {
				int x=d.x+dx[i];
				int y=d.y+dy[i];
				if(x<0||y<0||x>=n1||y>=n2)
					continue;
				if(arr[x][y]==0||b[x][y]==true)
					continue;
				queue.add(new pair(x,y));
				arr[x][y]=arr[d.x][d.y]+1;
				b[x][y]=true;
			}
		}
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			String st[]=br.readLine().split(" ");
			n1=Integer.parseInt(st[0]); n2=Integer.parseInt(st[1]);
			int n3=Integer.parseInt(st[2]), count=0;
			arr=new int[n1][n2];
			b=new boolean[n1][n2];
			for(int j=0; j<n3; j++) {
				String str[]=br.readLine().split(" ");
				arr[Integer.parseInt(str[0])][Integer.parseInt(str[1])]=1;
			}
			for(int j=0; j<n1; j++) {
				for(int k=0; k<n2; k++) {
					if(arr[j][k]==1&&b[j][k]==false) {
						b[j][k]=true;
						bfs(j,k);
						count++;
					}
				}
			}
			bw.write(count+"\n");
		}
		bw.flush();bw.close();
	}
}