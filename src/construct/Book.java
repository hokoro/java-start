package construct;

public class Book {
    String title; // 제목
    String author; // 저자
    int page; // 총 페이지수

    Book(){
        this("제목 정보 없음" , "작가 정보 없음" , 0);
    }
    Book(String title , String author){
        this(title , author ,0);
    }
    Book(String title , String author , int page){
        System.out.println("생성자 생성");
        System.out.println("title: " + title + " author: " + author + " page: " + page);
        this.title = title;
        this.author = author;
        this.page = page;
    }
    void displayInfo(){
        System.out.println("작품명 : " + title + " 작가 명 :" + author + "쪽 수 : " + page );
    }

}
