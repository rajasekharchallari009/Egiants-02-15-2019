package main.java.com.egiantsprojects.practice.mapper;

import main.java.com.egiantsprojects.practice.dto.PersonDTO;
import main.java.com.egiantsprojects.practice.model.Person;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.TargetType;

/**
 * Created by mouradzouabi on 04/12/15.
 */
@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PersonMapper {

    public PersonDTO toDTO(Person person);

    public Person toEntity(PersonDTO person);

    public void mapToEntity(PersonDTO personDTO, @MappingTarget Person person);

}
