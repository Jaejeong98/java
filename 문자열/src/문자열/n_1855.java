package ¹®ÀÚ¿­;

import java.util.*;

public class n_1855 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N = sc.nextInt();
        String st=sc.next();
        int l=st.length()/N;
        char arr[][]=new char[l][N];
        for(int i=0; i<l; i++){
          for(int j=0; j<N; j++){
            if(i%2==0) arr[i][j]=st.charAt(i*N+j);
            else arr[i][N-j-1]=st.charAt(i*N+j);
          }
        }
        for(int i=0; i<N; i++){
          for(int j=0; j<l; j++)
            System.out.print(arr[j][i]);
        }
    }
}