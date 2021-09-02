package ¹®ÀÚ¿­;

import java.util.*;

public class n_5426 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=0; i<N; i++){
          String st=sc.next();
          int l=(int)Math.sqrt(st.length());
          char arr[][]=new char[l][l];
          for(int j=0; j<l; j++){
            for(int k=0; k<l; k++)
              arr[j][k]=st.charAt(j*l+k);
          }
          for(int j=l-1; j>=0; j--){
            for(int k=0; k<l; k++)
              System.out.print(arr[k][j]);
          }
          System.out.println("");
        }
    }
}