package com.prodyna.training.spring.dao;

import com.prodyna.training.spring.domain.Genre;
import com.prodyna.training.spring.domain.Movie;
import java.util.List;
import java.util.Set;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {

  //Method Queries

  /**
   * Task 1
   * @param genre
   * @return
   */
  Set<Movie> queryByGenre(@Param("genre") Genre genre);


  /**
   * Task 2
   * @param name
   * @return
   */
  Long countAllByPrizes_Movie_Title(@Param("name") String name);


  /**
   * Task 3
   * @param postCodes
   * @return
   */

  //JPQL Queries

  /**
   * Task 1 JPQL Query
   *
   * http://localhost:8080/api/movies/search/getMoviesWithMostPrize?prizeText=%Oscar%
   * @param prizeText
   * @return
   */



}
