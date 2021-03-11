package ¼öÇÐp3;

import java.io.*;

public class n_5361 {
	public static void main(String[] args) throws IOException{
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
      int n=Integer.parseInt(br.readLine());
      double[] arr= {350.34,230.90,190.55,125.30,180.90};
      for(int i=0; i<n; i++) {
    	  String[] st=br.readLine().split(" ");
    	  double sum=0;
    	  for(int j=0; j<5; j++) {
    		  sum+=Integer.parseInt(st[j])*arr[j];
    	  }
    	  bw.write("$"+String.format("%.2f", sum)+"\n");
      }
      bw.flush();
      bw.close();
	}
}