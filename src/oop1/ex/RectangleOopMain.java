package oop1.ex;
public class RectangleOopMain {
    public static void main(String[] args) {
        Rectangle data = new Rectangle();
        data.width = 5;
        data.height = 8;
        System.out.println("넓이: " + data.caculate());
        System.out.println("둘레: " + data.calulatePermiter());
        System.out.println("정사각형 여부: " + data.isSquare());
    }
}
