package ¼öÇÐp6;

import java.io.*;

public class n_4435 {
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int T=Integer.parseInt(br.readLine()), arr1[]={1,2,3,3,4,10}, arr2[]={1,2,2,2,3,5,10};
        for(int i=0; i<T; i++){
          String[] st1=br.readLine().split(" "), st2=br.readLine().split(" ");
          int sum1=0, sum2=0;
          for(int j=0; j<st1.length; j++)
            sum1+=Integer.parseInt(st1[j])*arr1[j];
          for(int j=0; j<st2.length; j++)
            sum2+=Integer.parseInt(st2[j])*arr2[j];
          if(sum1==sum2) bw.write("Battle "+(i+1)+": No victor on this battle field\n");
          else bw.write("Battle "+(i+1)+(sum1>sum2?": Good triumphs over Evil\n":": Evil eradicates all trace of Good\n"));
        }
        bw.flush(); bw.close();
    }
}