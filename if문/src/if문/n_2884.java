package if¹®;

import java.util.*;

public class n_2884 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		int H=sc.nextInt();
		int M=sc.nextInt();
		int time=0;
		
		if(H==0&&M<45)
			H=24;
		time=H*60+M-45;
		
		System.out.println(time/60+" "+time%60);
	}
}
