package 그리디_알고리즘_p1;

import java.util.*;

public class n_16406 {
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
       int T=sc.nextInt(), count=0;
       String st1=sc.next(), st2=sc.next();
       int len=st1.length();
       for(int i=0; i<len; i++){
        if(st1.charAt(i)==st2.charAt(i)) count++;
       }
       System.out.println(Math.min(count,T)+Math.min(len-count,len-T));
    }
}