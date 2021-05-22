package 다이나믹_프로그래밍p1;

import java.io.*;

public class n_11660 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		String st[]=br.readLine().split(" ");
		int num1=Integer.parseInt(st[0]), num2=Integer.parseInt(st[1]);
		int arr[][]=new int[num1+1][num1+1];
		int dp[][]=new int[num1+1][num1+1];
		for(int i=1; i<=num1; i++) {
			String str[]=br.readLine().split(" ");
			for(int j=1; j<=num1; j++) {
				arr[i][j]=Integer.parseInt(str[j-1]);
				dp[i][j] = dp[i-1][j] + dp[i][j-1] - dp [i-1][j-1] + arr[i][j];
			}
		}for(int i=0; i<num2; i++) {
			String str[]=br.readLine().split(" ");
			int n1=Integer.parseInt(str[0]),n2= Integer.parseInt(str[1]);
			int n3=Integer.parseInt(str[2]),n4= Integer.parseInt(str[3]);
			bw.write(dp[n3][n4] - dp[n3][n2-1] - dp[n1-1][n4] + dp[n1-1][n2-1]+"\n");
		}
		bw.flush();
		bw.close();
	}
}
