//컨트롤 쉬프트 에프는 자리정렬하는 단축키다.
// 자바자료형 boolean / char / byte / short / int / long /float / double
//            논리값 / 문자 /             정수           /      실수    /


class Main {

    public static void main(String[] args) {

        // int[] arr = new(객체 1개 만들겠다) 설계도;
        // 객체 =  폴더 개념으로 인식하자

        int a = 10;

        int[] arr = new int[3];

        // 참조형
        //  '정수들(int[])' 모양으로 만들어진 객체의 리모컨만 들어갈 수 있는 arr에
        // arr라는 변수에 int[4](설계도)로 만든 객체의 리모컨을 넣겠다.
        
        // int 3개의 공간을 만들겠다는 뜻
        // 항상 저장할때 1이 아닌 0부터 시작한다.

        arr[0] = 10; // 각 방들에 숫자를 부여하겠다는 뜻
        arr[1] = 20;
        arr[2] = 30;

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        System.out.println(arr[0] + arr[2] + arr[0]); // 미리 저장해준 객체로 계산도 가능하다.

        System.out.println("총합:" + arr[0] + arr[2] + arr[0]); //문장+숫자이므로 문장으로 나온다

        System.out.println("총합:" + (arr[0] + arr[2] + arr[0])); //가로를 넣어줘야한다.

        // GC : 가비지 컬렉션(터)
        //지역 변수는 자동으로 메모리를 반납
    }
}

// 기본타입은 변수에 직접 담긴다.
// 참조(객체)타입은 레퍼런스(리모컨,주소)에 의해서 참조된다.

