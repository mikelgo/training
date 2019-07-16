package com.prodyna.training.spring.properties;

import com.prodyna.training.spring.config.MoviesConfiguration;
import com.prodyna.training.spring.factory.MovieFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ActiveProfiles("movies")
@SpringBootTest(classes = {
    MoviesConfiguration.class,
    MovieFactory.class
})
@EnableConfigurationProperties(MoviesConfiguration.class)
public class PropertiesStubTest {

  @Test
  public void givenBean_inContext() {



  }

}
