package com.prodyna.training.spring.integration;

import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.prodyna.training.spring.domain.Movie;
import java.io.IOException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class MovieResourceSpringMvcTest {


  @Autowired
  private TestRestTemplate restTemplate;

  @Test
  public void testGetMoviesAsStringResponse() throws IOException {

    String body = this.restTemplate.getForObject("//api/v1/movies", String.class);

    Movie[] movies = new ObjectMapper().readValue(body, Movie[].class);

    assertThat(movies.length, is(5));
    assertThat(movies[0].getTitle(), is("Matrix"));

  }

  @Test
  public void testGetMovieAsEntityResponse() {

    ResponseEntity<Movie> movieResponse = this.restTemplate
        .getForEntity("//api/v1/movies/1", Movie.class);

    assertThat(movieResponse.getBody(), is(not(equalTo(null))));
    assertThat(movieResponse.getBody().getTitle(), is("Matrix"));

  }

}
