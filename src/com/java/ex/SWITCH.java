package com.java.ex;

import java.util.Scanner;

public class SWITCH {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("자바 성적을 입력하시오");
            int result = Integer.parseInt((scan.next()));
            if(result <=100 && result >= 0) {
                switch (result) {
                    case 100:
                    case 99:
                    case 98:
                    case 97:
                    case 96:
                    case 95:
                        System.out.println("A+입니다");
                        break;

                    case 94:
                    case 93:
                    case 92:
                    case 91:
                    case 90:
                        System.out.println("A0입니다");
                        break;

                    case 89:
                    case 88:
                    case 87:
                    case 86:
                    case 85:
                        System.out.println("B+입니다");
                        break;

                    case 84:
                    case 83:
                    case 82:
                    case 81:
                    case 80:
                        System.out.println("B0입니다");
                        break;

                    case 79:
                    case 78:
                    case 77:
                    case 76:
                    case 75:
                        System.out.println("C+입니다");
                        break;

                    case 74:
                    case 73:
                    case 72:
                    case 71:
                    case 70:
                        System.out.println("C0입니다");
                        break;

                    case 69:
                    case 68:
                    case 67:
                    case 66:
                    case 65:
                        System.out.println("D+입니다");
                        break;
                    case 64:
                    case 63:
                    case 62:
                    case 61:
                    case 60:
                        System.out.println("D0입니다");
                        break;
                    default:
                        System.out.println("F입니다");
                }
            }
            else
                System.out.println("병신아 다시 입력해");
        }
    }
}