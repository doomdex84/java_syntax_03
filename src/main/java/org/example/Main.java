package org.example;
//컨트롤 쉬프트 에프는 자리정렬하는 단축키다.
// 자바자료형 boolean / char / byte / short / int / long /float / double
//            논리값 / 문자 /             정수           /      실수    /


class Main {
    public static void main(String[] args) {
        샤오미Tv a샤오미Tv = new 샤오미Tv();
        삼성Tv a삼성Tv = new 삼성Tv();
        LGTv aLGTv = new LGTv();

        a샤오미Tv.켜기("샤오미");
        // 출력 => 샤오미Tv 켜집니다.
        a샤오미Tv.끄기("샤오미");
        // 출력 => 샤오미Tv 꺼집니다.
        a샤오미Tv.vr켜기("샤오미","vr");
        // 출력 => 샤오미Tv vr켜기!

        a삼성Tv.켜기("삼성");
        // 출력 => 삼성Tv 켜집니다.
        a삼성Tv.끄기("삼성");
        // 출력 => 삼성Tv 꺼집니다.
        a삼성Tv.ar켜기("삼성","ar");
        // 출력 => 삼성Tv ar켜기!

        aLGTv.켜기("LG");
        // 출력 => LGTv 켜집니다.
        aLGTv.끄기("LG");
        // 출력 => LGTv 꺼집니다.
        aLGTv.게임모드전환("LG","게임모드");
        // 출력 => LGTv 게임모드전환!
    }
}

class tv{

   String lasta;
   String lastb;

    void 켜기(String a){
        System.out.println( a + "Tv 켜집니다.");

        String lasta;
    }
    void 끄기(String a){
        System.out.println( a+ "Tv 꺼집니다.");
        String lasta;
    }
}

class 샤오미Tv extends tv{
    void vr켜기(String a, String b ) {
        System.out.println(a + "Tv " +  b +"켜기");
    }
}
class 삼성Tv extends tv{
    void ar켜기(String a, String b ) {
        System.out.println(a + "Tv " + b + "켜기");
    }
}


class LGTv extends tv{
    void 게임모드전환(String a,String b ) {
        System.out.println(a + "Tv " + b + "전환 ");
    }

}