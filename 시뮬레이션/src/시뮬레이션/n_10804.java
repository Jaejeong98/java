package ½Ã¹Ä·¹ÀÌ¼Ç;

import java.io.*;

public class n_10804 {
	public static void main(String[] args)throws IOException{
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
	    int arr[]=new int[21];
	    for(int i=1; i<=20; i++)
	      arr[i]=i;
	    for(int i=0; i<10; i++){
	      String st[]=br.readLine().split(" ");
	      int n1=Integer.parseInt(st[0]), n2=Integer.parseInt(st[1]);
	      for(int j=0; j<=(int)Math.ceil(n2-n1)/2; j++){
	        int temp=arr[n1+j];
	        arr[n1+j]=arr[n2-j];
	        arr[n2-j]=temp;
	      }
	    }
	    for(int i=1; i<=20; i++)
	      bw.write(arr[i]+" ");
	    bw.flush(); bw.close();
	  }
}
