package com.prodyna.training.spring.dao.custom;

import com.prodyna.training.spring.domain.Movie;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class AppRepositoryImpl implements AppRepositoryCustom {

  @PersistenceContext
  EntityManager entityManager;

  @Override
  public Movie findMovie(Long id) {

    return entityManager.find(Movie.class, id);

  }

  @Override
  public List<Movie> getMovies() {

    return entityManager
        .createQuery("select m from Movie m", Movie.class)
        .getResultList();

  }

}
