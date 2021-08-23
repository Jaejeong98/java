package ±¸Çö2;

import java.util.*;

public class n_2605 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0; i<N; i++){
          int num=sc.nextInt();
          list.add(num, i+1);
        }
        for(int i=N-1; i>=0; i--)
          System.out.print(list.get(i)+" ");
    }
}