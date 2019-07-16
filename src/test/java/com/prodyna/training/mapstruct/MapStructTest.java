package com.prodyna.training.mapstruct;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.notNullValue;

import java.util.Date;
import org.junit.Test;

public class MapStructTest {


    @Test
    public void convertToDto() {

        PersonEntity personEntity = new PersonEntity("Mr", "Leonardo di Caprio",
                Gender.MALE, 45, new Date(88, 1, 1));
        PersonDTO personDTO = PersonMapper.INSTANCE.personEntityToPersonDto(personEntity);

        assertThat(personDTO, is(notNullValue()));
        assertThat(personDTO.getTitle(), is("Mr"));
        assertThat(personDTO.getFullName(), is("Leonardo di Caprio"));
        assertThat(personDTO.getGender(), is(Gender.MALE));
        assertThat(personDTO.getAge(), is(45));
        assertThat(personDTO.getBirthday(), is("1988-02-01"));


        //reverse

        PersonEntity personEntityFromDto = PersonMapper.INSTANCE.personDtoToPersonEntity(personDTO);
        assertThat(personEntityFromDto, is(notNullValue()));
        assertThat(personEntityFromDto.getTitle(), is("Mr"));
        assertThat(personEntityFromDto.getName(), is("Leonardo di Caprio"));
        assertThat(personEntityFromDto.getGender(), is(Gender.MALE));
        assertThat(personEntityFromDto.getAge(), is(45));


        //Composition

        AccountEntity accountEntity = new AccountEntity(100);

        PersonalAccountDTO personalAccountDTO = PersonMapper.INSTANCE
                .personAndAccountEntityToPersonalAccountDto(personEntity, accountEntity);

        assertThat(personalAccountDTO, is(notNullValue()));
        assertThat(personalAccountDTO.getCustomerName(), is("Leonardo di Caprio"));
        assertThat(personalAccountDTO.getBalanceSum(), is(100));


    }
}
