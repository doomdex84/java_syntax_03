//컨트롤 쉬프트 에프는 자리정렬하는 단축키다.
// 자바자료형 boolean / char / byte / short / int / long /float / double
//            논리값 / 문자 /             정수           /      실수    /



// 1.arr1 변수에 [true, false, true] 연결
// 2.arr2 변수에 [3.14, 7.77, 11.11] 연결
// 3.arr3 변수에 [1~10] 연결


class Main {

    public static void main(String[] args) {

        boolean[] a = new boolean[3];

        a[0] = true;
        a[1] = false;
        a[2] = true;


        System.out.println("표현하기:" + a[0] + a[1] + a[2]);

        double[] c = new double[3];

        c[0] = 3.14;
        c[1] = 7.77;
        c[2] = 11.11;

        System.out.println("표현하기:" + c[0] + c[1] + c[2]);


       int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++){
        arr[i] = i++;
    }
       System.out.println(arr);


        }

    }


// 기본타입은 변수에 직접 담긴다.
// 참조(객체)타입은 레퍼런스(리모컨,주소)에 의해서 참조된다.

