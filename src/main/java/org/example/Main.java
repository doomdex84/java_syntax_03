//컨트롤 쉬프트 에프는 자리정렬하는 단축키다.

//결과가 왜 이렇게 나오는가?를 서술
//명확하게 한줄한줄 세부적으로 표현하기

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        int a =97;

        System.out.printf("%c\n",a);
        System.out.printf("%d\n",a);

        System.out.println("정수 1개 입력해 : ");
        Scanner sc = new Scanner(System.in); // System.in : 입력

        int num = sc.nextInt();
        System.out.println(num);

    }
}



