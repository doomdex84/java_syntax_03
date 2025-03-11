//컨트롤 쉬프트 에프는 자리정렬하는 단축키다.
// 자바자료형 boolean / char / byte / short / int / long /float / double
//            논리값 / 문자 /             정수           /      실수    /




package org.example;

class Main {

    public static void main(String[] args) {

        int 결과;

        결과 = 계산기.합(10, 20);
        System.out.println("결과 : " + 결과);
        // 출력 => 결과 : 30

        결과 = 계산기.합(30, 20);
        System.out.println("결과 : " + 결과);
        // 출력 => 결과 : 50

        결과 = 계산기.합(30, 70);
        System.out.println("결과 : " + 결과);
        // 출력 => 결과 : 100

        결과 = 계산기.차(30, 70);
        System.out.println("결과 : " + 결과);
        // 출력 => 결과 : -40

        결과 = 계산기.곱(3, 7);
        System.out.println("결과 : " + 결과);
        // 출력 => 결과 : 21
    }

}

class 계산기{

    static int 합(int a ,int b ){

//        System.out.println(" a + b : " + (a+b));
        
        return a+b;
    }

    static int 차(int a ,int b ) {
//        System.out.println(" a - b : " + (a - b));
        
        return a-b;
    }

    static int 곱(int a ,int b ) {
//        System.out.println(" a * b : " + (a * b));
        
        return a*b;
    }



}

