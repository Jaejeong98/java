package 배열_1차원;

import java.util.*;

public class n_8958 {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String st=new String();
		for(int j=0; j<n; j++) {
			int combo=0, sum=0;
			st=sc.next();
			for(int i=0; i<st.length(); i++){
				if(st.charAt(i)=='O') {
					combo++;
					sum+=combo;
				}
				else if(st.charAt(i)=='X')
					combo=0;
			}
			System.out.println(sum);
		}
	}
}
