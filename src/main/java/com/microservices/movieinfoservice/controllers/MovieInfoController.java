package com.microservices.movieinfoservice.controllers;

import com.microservices.movieinfoservice.models.Movie;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/movie-info")
public class MovieInfoController {

    private static final Map<String,Movie> hardCodedMoviesDB = new HashMap<>();

    static {
        hardCodedMoviesDB.put("movie_id_1", Movie.builder().movieId("movie_id_1").movieName("movie_name_1").description("movie_desc_1").build());
        hardCodedMoviesDB.put("movie_id_2", Movie.builder().movieId("movie_id_2").movieName("movie_name_2").description("movie_desc_2").build());
        hardCodedMoviesDB.put("movie_id_3", Movie.builder().movieId("movie_id_3").movieName("movie_name_3").description("movie_desc_3").build());
        hardCodedMoviesDB.put("movie_id_4", Movie.builder().movieId("movie_id_4").movieName("movie_name_4").description("movie_desc_4").build());
        hardCodedMoviesDB.put("movie_id_5", Movie.builder().movieId("movie_id_5").movieName("movie_name_5").description("movie_desc_5").build());
    }


    @GetMapping(value = "/movie/{movieId}")
    public Movie getMovieInfo(@PathVariable(value = "movieId") String id) {
        return hardCodedMoviesDB.get(id);
    }
}
