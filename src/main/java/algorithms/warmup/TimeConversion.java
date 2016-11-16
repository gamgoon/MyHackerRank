package main.java.algorithms.warmup;

import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String s = sc.nextLine();
    	sc.close();
    	
    	int length = s.length();
    	String hh = s.substring(0, 2);
    	Integer hhInt = Integer.parseInt(hh);
    	int adj = hhInt == 12 ? 12 : 0;
    	String restWithoutM = s.substring(2, length - 2);
    	String m = s.substring(length - 2);
    	if("PM".equals(m)) {
    		hhInt += 12 - adj;
    		System.out.println(hhInt.toString() + restWithoutM);
    	} else {
    		hhInt -= adj;
    		System.out.println(hhInt == 0 ? "00" + restWithoutM : hh + restWithoutM);
    	}
    }
}
