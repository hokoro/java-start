package oop1.ex;

public class Rectangle {
    int width;
    int height;

    int caculate(){ // 클래스 안에 작성된 메서드이기 때문에 멤버 변수를 바로 사용해도 된다.
        return width * height;
    }

    int calulatePermiter(){
        return 2 * (width + height);
    }

    boolean isSquare(){
        return width == height;
    }
}
