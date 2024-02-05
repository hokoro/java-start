package cond;

public class DistanceEx {
    public static void main(String[] args) {
        int distance = 15;
        String traffic;
        if (distance <= 1){
            traffic = "도보";
        } else if (distance <= 10) {
            traffic = "자전거";
        } else if (distance <= 100) {
            traffic = "자동차";
        } else {
            traffic = "비행기";
        }

        System.out.println(traffic + "를 이용하세요");

    }
}
