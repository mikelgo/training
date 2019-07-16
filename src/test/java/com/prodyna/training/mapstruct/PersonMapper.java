package com.prodyna.training.mapstruct;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(uses = DateMapper.class)
public interface PersonMapper {

    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    @Mapping(source = "name", target = "fullName")
    @Mapping(source = "birthday", target = "birthday")
    PersonDTO personEntityToPersonDto(PersonEntity personEntity);

    @InheritInverseConfiguration
    PersonEntity personDtoToPersonEntity(PersonDTO personDto);

    @Mapping(source = "personEntity.name", target = "customerName")
    @Mapping(source = "accountEntity.balance", target = "balanceSum")
    PersonalAccountDTO personAndAccountEntityToPersonalAccountDto
            (PersonEntity personEntity, AccountEntity accountEntity);


}
