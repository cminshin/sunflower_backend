package Sunflower.Sunflowerspring.dto;

public class ReturnMovies_Dto {

    public ReturnMovies_Dto(String movie1, String movie2, String movie3, String movie4, String movie5)
    {
        setMovie1(movie1);
        setMovie2(movie2);
        setMovie3(movie3);
        setMovie4(movie4);
        setMovie5(movie5);
    }

    String movie1;
    String movie2;
    String movie3;
    String movie4;
    String movie5;

    public String getMovie1() {
        return movie1;
    }

    public void setMovie1(String movie1) {
        this.movie1 = movie1;
    }

    public String getMovie2() {
        return movie2;
    }

    public void setMovie2(String movie2) {
        this.movie2 = movie2;
    }

    public String getMovie3() {
        return movie3;
    }

    public void setMovie3(String movie3) {
        this.movie3 = movie3;
    }

    public String getMovie4() {
        return movie4;
    }

    public void setMovie4(String movie4) {
        this.movie4 = movie4;
    }

    public String getMovie5() {
        return movie5;
    }

    public void setMovie5(String movie5) {
        this.movie5 = movie5;
    }
}
