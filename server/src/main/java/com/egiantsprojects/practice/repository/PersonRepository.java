package main.java.com.egiantsprojects.practice.repository;

import main.java.com.egiantsprojects.practice.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long>, PersonRepositoryCustom {

}
