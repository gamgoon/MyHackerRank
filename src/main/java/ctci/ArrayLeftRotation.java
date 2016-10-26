package main.java.ctci;

import java.util.Scanner;

public class ArrayLeftRotation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int result[] = getResultArray(a, k);
        System.out.println(test_getStringFromArray(result));
    }
    
    public static String test_getStringFromArray(int[] result) {
    	StringBuilder sb = new StringBuilder();
    	for (int i=0;i<result.length;i++) {
    		sb.append(result[i]);
    		if (i < result.length - 1)
    			sb.append(' ');
    	}
    	return sb.toString();
	}

	public static int[] getResultArray(int[] arr, int offset) {
        if (offset == arr.length)
            return arr;
        int result[] = new int[arr.length];
        for (int i=0; i<arr.length; i++) {
        	if (i < offset) {
        		result[arr.length - offset + i] = arr[i];
        	} else {
        		result[i - offset] = arr[i];
        	}
        }
        return result;
    }
}
