package main.java.com.egiantsprojects.practice.service;

import main.java.com.egiantsprojects.practice.dto.PersonDTO;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PersonService {

    Page<PersonDTO> findPersons(Pageable pageable);

    PersonDTO getPerson(Long id);

    void updatePerson(PersonDTO personDTO);

    void savePerson(PersonDTO personDTO);

    void deletePerson(Long id);

}
