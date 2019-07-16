package com.prodyna.training.mapstruct;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PersonalAccountDTO {

    private int balanceSum;
    private String customerName;

}
