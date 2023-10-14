package dev.macedolg.movies.services;

import dev.macedolg.movies.model.Movie;
import dev.macedolg.movies.repository.iMovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private iMovieRepository movieRepo;

    public List<Movie> allMovies() {
    //    System.out.println(movieRepo.findAll().toString());
        return movieRepo.findAll();
    }

    public Optional<Movie> singleMovie(String imdbId) {
        return movieRepo.findMovieByImdbId(imdbId);
    }
}
