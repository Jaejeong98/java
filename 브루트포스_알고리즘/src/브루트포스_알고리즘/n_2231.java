package 브루트포스_알고리즘;

import java.util.*;

public class n_2231 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt(), ans=0;
		 for(int i=num; i>0; i--){
	         int sum = 0;
	         String st = Integer.toString(i);
	         for(int j=0; j<st.length(); j++)
	        	 sum += st.charAt(j)-'0';
	         if(i + sum == num)
	            ans = i;
	     }
	     if(ans == 0)
	        System.out.println(0);
	     else
	        System.out.println(ans);
	}
}
