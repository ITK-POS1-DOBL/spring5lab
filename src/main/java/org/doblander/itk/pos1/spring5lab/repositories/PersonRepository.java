package org.doblander.itk.pos1.spring5lab.repositories;

import org.doblander.itk.pos1.spring5lab.entities.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long> {


}
