package org.example;
//컨트롤 쉬프트 에프는 자리정렬하는 단축키다.
// 자바자료형 boolean / char / byte / short / int / long /float / double
//            논리값 / 문자 /             정수           /      실수    /


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 문제 : 아래가 실행되도록 해주세요.
// ArrayList 사용가능

class Main {
    public static void main(String[] args) {
        사람인력관리소 a사람인력관리소 = new 사람인력관리소();

        a사람인력관리소.add사람("홍길순", 33);
        // 나이가 33살인 1번째 사람(홍길순)이 추가되었습니다.
        a사람인력관리소.add사람("홍길동", 20);
        // 나이가 20살인 2번째 사람(홍길동)이 추가되었습니다.
        a사람인력관리소.add사람("임꺽정", 30);
        // 나이가 30살인 3번째 사람(임꺽정)이 추가되었습니다.


    }
}
class 사람인력관리소{
    static int lastadd;

    int age;
    String name;



    void add사람 (String name, int age) {

        ArrayList<Integer> add사람 = new ArrayList<>(10);
        add사람.add(0);
        add사람.add(1);
        add사람.add(2);



        System.out.println("나이가 " + age + "살인 " + add사람.add(0)  + "번째 사람(" + name + ")이 추가되었습니다.");

        }
    }

