package ¹®ÀÚ¿­;

import java.util.*;

public class n_5949 {
  public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
        String st[]=sc.nextLine().split("");
        for(int i=0; i<st.length; i++){
            if((st.length-(i+1))%3==0&&i!=(st.length-1)) System.out.print(st[i]+",");
            else System.out.print(st[i]);
        }
	}
}