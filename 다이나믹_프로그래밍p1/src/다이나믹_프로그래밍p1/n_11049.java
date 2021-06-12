package 다이나믹_프로그래밍p1;

import java.io.*;

public class n_11049 {
	public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int [][] arr = new int[n][n], arr2 = new int[n][2];
        for(int i=0; i<n; i++) {
            String st[]=br.readLine().split(" ");
            arr2[i][0] = Integer.parseInt(st[0]);
            arr2[i][1] = Integer.parseInt(st[1]);
        }
        for(int i=1; i<n; i++) {
            for(int j=0; j<n-i; j++) {
                arr[j][j+i] = 2147483647;
                for(int k=0; k<i; k++) {
                    int cost = arr[j][j+k] +arr[j+k+1][j+i] + arr2[j][0] * arr2[j+i][1] * arr2[j+k][1];
                    arr[j][j+i] = Math.min(arr[j][j+i], cost);
                }
            }
        }
        System.out.println(arr[0][n-1]);
    }
}