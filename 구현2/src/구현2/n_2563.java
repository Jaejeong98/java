package ����2;

import java.io.*;

public class n_2563 {
    public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine()), arr[][]=new int[101][101], count=0;
        for(int i=0; i<T; i++){
            String st[]=br.readLine().split(" ");
            int n1=Integer.parseInt(st[0]), n2=Integer.parseInt(st[1]);
            for(int j=n1; j<n1+10; j++){
                for(int k=n2; k<n2+10; k++){
                    if(arr[j][k]==0){
                        arr[j][k]++;
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}