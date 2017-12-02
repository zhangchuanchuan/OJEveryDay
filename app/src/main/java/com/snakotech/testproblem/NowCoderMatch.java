package com.snakotech.testproblem;

import java.util.Scanner;


public class NowCoderMatch {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        int size = sin.nextInt();

        for (int i=0; i < size; i++) {
            int[] alice = new int[6];
            int[] bob = new int[6];
            for (int j = 0; j < 6; j++) {
                alice[j] = sin.nextInt();
            }
            for (int k = 0; k < 6; k++) {
                bob[k] = sin.nextInt();
            }

            int aCount = 0;
            int bCount = 0;
            int tieCount = 0;
            for (int j = 0; j < 6; j++) {
                for (int k = 0; k < 6; k++) {
                    if (alice[j] > bob[k]) {
                        aCount++;
                        if (aCount > (36 - tieCount) / 2) {
                            j = 6;
                            break;
                        }
                    } else if (alice[j] < bob[k]) {
                        bCount++;
                        if (bCount > (36 - tieCount) / 2) {
                            j = 6;
                            break;
                        }
                    } else {
                        tieCount++;
                    }
                }
            }

            if (aCount == bCount) {
                System.out.println("Tie");
            } else if (bCount > aCount) {
                System.out.println("Bob");
            } else {
                System.out.println("Alice");
            }
        }
    }
}
