package com.prodyna.training.jackson;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.notNullValue;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.io.File;
import java.util.List;
import org.junit.Test;


public class JacksonTest {


  @Test
  public void createPersonAndMarshalToFileTest() {

    try {

      ObjectMapper objectMapper = new ObjectMapper();
      objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
      Person person = new Person("Mr", "Leonardo di Caprio",
          Gender.MALE, 45, "1988-02-01");
      objectMapper.writeValue(new File("target/person.json"), person);


    } catch (Exception e) {

    }

  }

  @Test
  public void unMarshalToPersonFromStringTest() {

    String personJson = "{\"title\":\"Mr\",\"fullName\":\"Leonardo di Caprio\",\"gender\":\"MALE\",\"age\":45,\"birthday\":\"1988-02-01\"}";
    try {
      ObjectMapper objectMapper = new ObjectMapper();
      Person person = objectMapper.readValue(personJson, Person.class);
      assertThat(person, is(notNullValue()));
      assertThat(person.getTitle(), is("Mr"));

    } catch (Exception e) {

    }
  }

  @Test
  public void unMarshalFromFileToPersonTest() {
    try {

      ObjectMapper objectMapper = new ObjectMapper();
      Person person = objectMapper.readValue(new File("person.json"), Person.class);
      assertThat(person, is(notNullValue()));
      assertThat(person.getTitle(), is("Mr"));

    } catch (Exception e) {

    }
  }

  @Test
  public void readFileAsJsonNodeTest() {
    try {

      ObjectMapper objectMapper = new ObjectMapper();
      //no type needed
      JsonNode personNode = objectMapper.readTree(new File("person.json"));
      assertThat(personNode, is(notNullValue()));
      assertThat(personNode.get("title"), is("Mr"));

    } catch (Exception e) {

    }
  }

  @Test
  public void readStringAsPersonListTest() {

    String jsonArray =
        "[{ \"title\" : \"mr\", \"fullName\" : \"Neo\" }, { \"title\" : \"mrs\", \"fullName\" : \"Alice\" }]";

    try {

      ObjectMapper objectMapper = new ObjectMapper();
      List<Person> listPerson = objectMapper.readValue(jsonArray, new TypeReference<List<Person>>(){});

      assertThat(listPerson.size(), is(2));
      assertThat(listPerson.get(0).getFullName(), is("Neo"));


    } catch (Exception e) {

    }
  }

}
