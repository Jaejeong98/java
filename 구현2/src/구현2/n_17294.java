package 구현2;

import java.util.*;

public class n_17294 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String st[]=sc.nextLine().split("");
		boolean b=true;
		if(st.length==1) {
			System.out.println("◝(⑅•ᴗ•⑅)◜..°♡ 뀌요미!!");
			return;
		}
		int num=Integer.parseInt(st[1])-Integer.parseInt(st[0]);
		for(int i=1; i<st.length-1; i++) {
			if(Integer.parseInt(st[i+1])-Integer.parseInt(st[i])!=num) {
				b=false;
				break;
			}
		}
		System.out.println(b==true?"◝(⑅•ᴗ•⑅)◜..°♡ 뀌요미!!":"흥칫뿡!! <(￣ ﹌ ￣)>");
	}
}
