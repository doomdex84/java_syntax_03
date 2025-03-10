//컨트롤 쉬프트 에프는 자리정렬하는 단축키다.
// 자바자료형 boolean / char / byte / short / int / long /float / double
//            논리값 / 문자 /             정수           /      실수    /



// 1.arr1 변수에 [true, false, true] 연결
// 2.arr2 변수에 [3.14, 7.77, 11.11] 연결
// 3.arr3 변수에 [1~10] 연결


class Main {

    public static void main(String[] args) {


        //  1번 문제

        boolean[] arr1 = new boolean[3];

        arr1[0] = true;
        arr1[1] = false;
        arr1[2] = true;

        //  2번 문제

        System.out.println("정답:" + arr1[0] + arr1[1] + arr1[2]);

        double[] c = new double[3];

        c[0] = 3.14;
        c[1] = 7.77;
        c[2] = 11.11;

        System.out.println("정답:" + c[0] + c[1] + c[2]);


       // 3번 문제

        int a = 10;

        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;

            System.out.println(arr[i]);


        }

    }
}



// 기본타입은 변수에 직접 담긴다.
// 참조(객체)타입은 레퍼런스(리모컨,주소)에 의해서 참조된다.

