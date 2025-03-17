//컨트롤 쉬프트 에프는 자리정렬하는 단축키다.
// 자바자료형 boolean / char / byte / short / int / long /float / double
//            논리값 / 문자 /             정수           /      실수    /

package org.example;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A ;
        int B ;


        A = sc.nextInt();
        B = sc.nextInt();

        if (A > B){
            System.out.println(">");
        } else if (A == B){
            System.out.println("==");
        } else if (A < B){
            System.out.println("<");
        }

        sc.close();

    }
}

