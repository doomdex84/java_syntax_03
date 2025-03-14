package org.example;
//컨트롤 쉬프트 에프는 자리정렬하는 단축키다.
// 자바자료형 boolean / char / byte / short / int / long /float / double
//            논리값 / 문자 /             정수           /      실수    /


public class Main {
    public static void main(String[] args) {

        Article article1 =  new Article();
        System.out.println(article1.id);

        Article article2 =  new Article();
        System.out.println(article2.id);

        Article article3 =  new Article();
        System.out.println(article3.id);
        Article article4 =  new Article();
        System.out.println(article4.id);
        Article article5 =  new Article();
        System.out.println(article5.id);




    }
}

class Article {
    static int lastId; // 클래스 변수 , 모든 인스턴스 공유, 객체 생성과 무관

    int id;
    String regDate;
    // 인스턴스 변수


    static {
        lastId = 0;
    }

    Article () {
       lastId++;
       this.id = lastId;
    }

    Article(int id, String regDate){
        this.id = id;
        this.regDate = regDate;

    }

}

// Article > 뜻은 게시글