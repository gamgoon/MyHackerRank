package main.java.datastructures.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DynamicArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int lastAnswer = 0;
        int n = in.nextInt();
        int q = in.nextInt();
        List<Integer>[] seqList = new ArrayList[n];
        int[][] queries = new int[q][3];

        for (int i=0;i<q;i++) {
            queries[i][0] = in.nextInt();
            queries[i][1] = in.nextInt();
            queries[i][2] = in.nextInt();
        }

        // execute queries
        for (int i=0; i<q; i++) {
            int seq = (queries[i][1] ^ lastAnswer) % n;
//            System.out.printf("%d ^ %d mod %d = %d\n", queries[i][1], lastAnswer, n, seq);
            if (queries[i][0] == 1) {
                if (seqList[seq] == null) seqList[seq] = new ArrayList<>();
                seqList[seq].add(queries[i][2]);
//                System.out.printf("append %d at %d", queries[i][2], seq);
            } else {
                lastAnswer = seqList[seq].get(queries[i][2]%seqList[seq].size());
                System.out.println(lastAnswer);
            }
        }
        in.close();
    }
}
