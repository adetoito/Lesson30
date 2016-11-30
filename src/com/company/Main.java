package com.company;

public class Main {

    public static void main(String[] args) {
        // CHALLENGE

        for (int i = 1; i <= 8; i++) {
            for (int s = 1; s <= i; s++) {
                System.out.print("X");
            }
            System.out.println("");
        }
        System.out.println("");

        // REAL ANSWER

        StringBuffer sb = new StringBuffer(); // Creates a new object.

        String x = "";
        for (int i = 1; i <= 8; i++) {
            sb.append("X");
            System.out.println(sb);
        }
    }
}
