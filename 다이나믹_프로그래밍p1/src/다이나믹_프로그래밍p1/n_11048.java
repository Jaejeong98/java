package 다이나믹_프로그래밍p1;

import java.io.*;

public class n_11048 {
  public static void main(String[] args)throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    String st[]=br.readLine().split(" ");
    int n1=Integer.parseInt(st[0]),n2=Integer.parseInt(st[1]), arr[][]=new int[n1+1][n2+1];
    for(int i=1; i<=n1; i++){
      String str[]=br.readLine().split(" ");
      for(int j=1; j<=n2; j++)
        arr[i][j]=Integer.parseInt(str[j-1]);
    }
    for(int i=1; i<=n1; i++){
      for(int j=1; j<=n2; j++)
        arr[i][j]+=Math.max(arr[i][j-1],Math.max(arr[i-1][j-1],arr[i-1][j]));
    }
    System.out.println(arr[n1][n2]);
  }
}