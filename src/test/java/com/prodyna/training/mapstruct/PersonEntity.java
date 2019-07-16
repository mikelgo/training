package com.prodyna.training.mapstruct;


import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PersonEntity {

    private String title;
    private String name;
    private Gender gender;
    private int age;
    private Date birthday;

}
