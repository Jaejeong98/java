package ±¸Çö;

import java.text.*;
import java.util.*;

public class n_10699 {
	public static void main(String[] args) {
		Date date = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        df.setTimeZone(TimeZone.getTimeZone("Asia/Seoul"));
        System.out.format(df.format(date));
	}
}
