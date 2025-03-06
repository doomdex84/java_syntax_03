//컨트롤 쉬프트 에프는 자리정렬하는 단축키다.

//결과가 왜 이렇게 나오는가?를 서술
//명확하게 한줄한줄 세부적으로 표현하기



class Main {
    public static void main(String[] args) {


        int n = 3;

        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--){
            for (int k = n; k > i; k--){
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}



