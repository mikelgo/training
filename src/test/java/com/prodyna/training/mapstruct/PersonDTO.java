package com.prodyna.training.mapstruct;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PersonDTO {

    private String title;
    private String fullName;
    private Gender gender;
    private int age;
    private String birthday;


}
