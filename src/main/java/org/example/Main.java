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

        사람 a사람1 = a사람인력관리소.get사람(1);
        a사람1.자기소개();
        // 저는 1번, 홍길순, 33살 입니다.

        사람 a사람2 = a사람인력관리소.get사람(2);
        a사람2.자기소개();
        // 저는 2번, 홍길동, 20살 입니다.

        사람 a사람3 = a사람인력관리소.get사람(3);
        a사람3.자기소개();
        // 저는 3번, 임꺽정, 30살 입니다.
    }
}

class 사람인력관리소 {

    사람 a사람0;
    사람 a사람1;
    사람 a사람2;
    사람 a사람3;
    // 사람 a사람을 오래 기억하기 위해 위처럼 저장

    int 마지막_사람의_번호 = 0; // 전역변수

    void add사람(String 이름, int 나이) {

        int 번호 = 마지막_사람의_번호 + 1; // 지역변수

        사람 a사람 = new 사람(); // 객체를 묶는 행위
        a사람.번호 = 번호;
        a사람.이름 = 이름;
        a사람.나이 = 나이;

        if (번호 == 1) {
            a사람0 = a사람;
        } else if (번호 == 2) {
            a사람1 = a사람;
        } else if (번호 == 3) {
            a사람2 = a사람;
        } else if (번호 == 4) {
            a사람3 = a사람;
        }

        System.out.printf("나이가 %d살인 %d번째 사람(%s)이 추가되었습니다.\n", 나이, 번호, 이름);
        마지막_사람의_번호++;
    }

    사람 get사람(int 번호) {
       
        if (번호 == 1) {
            return a사람0;
        } else if (번호 == 2) {
            return a사람1;
        } else if (번호 == 3) {
            return a사람2;
        } else if (번호 == 4) {
            return a사람3;
        }
        return null;
    }
}

class 사람 {
    int 번호;
    String 이름;
    int 나이;

    void 자기소개() {
        System.out.printf("저는 %d번, %s, %d살 입니다.\n", this.번호, this.이름, this.나이);
    }
}
