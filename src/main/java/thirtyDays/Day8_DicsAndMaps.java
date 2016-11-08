package main.java.thirtyDays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day8_DicsAndMaps {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, Integer> phoneBook = new HashMap<>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            phoneBook.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            Integer phone = phoneBook.get(s);
            if (phone == null) {
            	System.out.println("Not found");
            } else {
            	System.out.println(s + "=" + phone);
            }
        }
        in.close();
    }
}
