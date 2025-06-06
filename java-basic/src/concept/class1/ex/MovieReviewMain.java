package concept.class1.ex;

public class MovieReviewMain {
    public static void main(String[] args) {
        MovieReview[] movieReviews = new MovieReview[2];

        MovieReview inception = new MovieReview();
        inception.title = "인셉션";
        inception.review = "인생은 무한 루프";

        MovieReview aboutTime = new MovieReview();
        aboutTime.title = "어바웃타임";
        aboutTime.review = "인생 시간 영화!";

        movieReviews[0] = inception;
        movieReviews[1] = aboutTime;

        for (MovieReview movieReview: movieReviews) {
            System.out.println("영화제목: " + movieReview.title + ", 리뷰: " + movieReview.review);
        }
    }
}
