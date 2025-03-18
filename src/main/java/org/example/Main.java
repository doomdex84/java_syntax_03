//컨트롤 쉬프트 에프는 자리정렬하는 단축키다.
// 자바자료형 boolean / char / byte / short / int / long /float / double
//            논리값 / 문자 /             정수           /      실수    /

package org.example;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 1900;

        a = sc.nextInt();

        for (int i = 1; i < a; i++) {

            if (i % 4 != 1) {
                return;
            }
            if (i % 100 != 1) {
                return;
            } else if (i % 400 != 1) {
                return;
            }
            System.out.println(i);
        }



    }
}