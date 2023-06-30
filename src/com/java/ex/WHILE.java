package com.java.ex;

public class WHILE {
    public static void main(String[] args) {
        int six = 0;
        int k = 0;

        while (k <=1000) {
            if (0 == (k % 6))
                six += k;
                k++;
            }
            System.out.println(six);
        }
    }

