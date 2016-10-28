package main.java.ctci;

import java.util.Scanner;

public class MakingAnagrams {
    public static int numberNeeded(String first, String second) {
    	int sameCount = numberOfSameChar(first, second);
    	return first.length() - sameCount + second.length() - sameCount;
    }
    public static int numberOfSameChar(String first, String second) {
    	int eqCount = 0;
    	char[] secondChars = second.toCharArray();
        for(int i=0; i<first.length(); i++) {
        	char ic = first.charAt(i);
        	for(int j=0; j<second.length(); j++) {
        		char jc = secondChars[j];
        		if(ic == jc) {
        			secondChars[j] = ' ';
        			eqCount++;
        			break;
        		}
        	}
        }
        return eqCount;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}
