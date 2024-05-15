package Sunflower.Sunflowerspring.controller;

import Sunflower.Sunflowerspring.dto.Favorite_Genres_Dto;
import Sunflower.Sunflowerspring.dto.Favorite_Movie_Dto;
import Sunflower.Sunflowerspring.dto.ReturnMovies_Dto;
import Sunflower.Sunflowerspring.dto.ReturnMovies_Dto2;
import Sunflower.Sunflowerspring.service.Favorite_Genres_Service;
import Sunflower.Sunflowerspring.service.Favorite_Movie_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = {"https://resttesttest.com/", "https://movie-recommendation.kro.kr", "203.253.23.10"}) // 컨트롤러에서 설정
@RestController
public class Favorite_Movie_Controller {

    private final Favorite_Movie_Service favorite_movie_service;

    @Autowired
    public Favorite_Movie_Controller(Favorite_Movie_Service favorite_movie_service) { this.favorite_movie_service = favorite_movie_service;    }

    @PostMapping("/api/favoritemovies")
    public ReturnMovies_Dto returnMovie(Favorite_Movie_Dto favorite_movie_dto)  {

        return favorite_movie_service.returnMovie(favorite_movie_dto);

    }


    @PostMapping("/api/favoritemovies2")
    public ReturnMovies_Dto2 returnMovie2(Favorite_Movie_Dto favorite_movie_dto)  {

        ReturnMovies_Dto aa = favorite_movie_service.returnMovie(favorite_movie_dto);


        String [] ss1 = {"ss", "ss"};
        ss1[0] = aa.getMovie1();
        ss1[1] = favorite_movie_service.getMoviePosterUri(aa.getMovie1());

        String [] ss2 = {"ss", "ss"};
        ss2[0] = aa.getMovie2();
        ss2[1] = favorite_movie_service.getMoviePosterUri(aa.getMovie2());


        String [] ss3 = {"ss", "ss"};
        ss3[0] = aa.getMovie3();
        ss3[1] = favorite_movie_service.getMoviePosterUri(aa.getMovie3());


        String [] ss4 = {"ss", "ss"};
        ss4[0] = aa.getMovie4();
        ss4[1] = favorite_movie_service.getMoviePosterUri(aa.getMovie4());

        String [] ss5 = {"ss", "ss"};
        ss5[0] = aa.getMovie5();
        ss5[1] = favorite_movie_service.getMoviePosterUri(aa.getMovie5());

        ReturnMovies_Dto2 returnMoviesDto2 = new ReturnMovies_Dto2(ss1, ss2 ,ss3, ss4, ss5);


        return returnMoviesDto2;

    }
}
