package class1.ex;

public class MovieReviewMain2 {
    public static void main(String[] args) {
        MovieReview movieReview1 = new MovieReview();
        movieReview1.title = "인셉션";
        movieReview1.review = "인생은 무한루프";

        MovieReview movieReview2 = new MovieReview();
        movieReview2.title = "어바웃 타임";
        movieReview2.review = "인생 시간 영화!";

        //MovieReview[] movieReviews = new MovieReview[2];
        //MovieReview[] movieReviews = new MovieReview[] {movieReview1 , movieReview2};
        MovieReview[] movieReviews = {movieReview1 , movieReview2};

        // 일반 for문
        for(int i = 0; i<movieReviews.length; i++) {
            System.out.println("영화 제목: " + movieReviews[i].title + " 영화 리뷰: " + movieReviews[i].review);
        }
        // 강화된 for문
        for(MovieReview m : movieReviews){
            System.out.println("영화 제목: " + m.title + " 영화 리뷰: " + m.review);
        }
    }
}
