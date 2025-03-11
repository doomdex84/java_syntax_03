//컨트롤 쉬프트 에프는 자리정렬하는 단축키다.
// 자바자료형 boolean / char / byte / short / int / long /float / double
//            논리값 / 문자 /             정수           /      실수    /

package org.example;

import java.awt.*;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {

        String msg = greet("Jin");
        System.out.println(msg);

        // 문자열만 담을 수 있는 변수 msg에 greet 함수 실행 결과를 넣는다.

        Point point = createPoint(5, 10);
        System.out.println("Point create at (" + point.x + ", " + point.y + ")");

        // 포인트 모양의 객체와 연결 될 포인트 변수;

        int[] evens = firstNEvenNumbers(5);
        System.out.println("first 5 even numbers : " + Arrays.toString(evens));
    }
      // int[] 모양의 객체와 연결될 변수




    public static String greet(String name) { // 문자열 매개변수 1개 받는 greet(String) 메서드
        return "Hello, " + name + "!"; // static ==  인스턴스화 없이 사용(new x)
    }

    public static Point createPoint(int x, int y) {
        return new Point(x, y); 
    }

    public static int[] firstNEvenNumbers(int n) {
        int[] evenNumbers = new int[n];

        for (int i = 0, num = 2; i < n; i++, num += 2) {
            evenNumbers[i] = num; //  evenNumber == 짝수
        }
        return evenNumbers;
    }
}