package com.github.kadehar.inno.lesson3.films;

import com.github.kadehar.inno.lesson3.movie.Movie;
import com.github.kadehar.inno.lesson3.movie.MovieAdditionalInfo;
import com.github.kadehar.inno.lesson3.movie.MovieMainInfo;

public class Task3 {
    public static void main(String[] args) {
        Movie[] films = {
                new Movie(
                        new MovieMainInfo(
                                "Король говорит!",
                                8.0,
                                2010
                        ),
                        new MovieAdditionalInfo(
                                "Биография",
                                "Великобритания",
                                true
                        )
                ),
                new Movie(
                        new MovieMainInfo(
                                "Чужой",
                                8.1,
                                1979
                        ),
                        new MovieAdditionalInfo(
                                "Ужасы",
                                "Великобритания",
                                true
                        )
                ),
                new Movie(
                        new MovieMainInfo(
                                "Воровка книг",
                                7.8,
                                2013
                        ),
                        new MovieAdditionalInfo(
                                "Военный",
                                "Великобритания",
                                false
                        )
                ),
        };
    }
}
