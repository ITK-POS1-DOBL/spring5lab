package org.doblander.itk.pos1.spring5lab.services;

import org.doblander.itk.pos1.spring5lab.entities.Person;
import org.doblander.itk.pos1.spring5lab.repositories.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SimpleHelloService implements HelloService {

    private PersonRepository personRepository;

    public SimpleHelloService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public List<String> getGreetings() {

        List<String> greetings = new ArrayList<>();
        Iterable<Person> persons = personRepository.findAll();
        //persons.iterator().hasNext();
        greetings.add("Hallo, "
                    + persons.iterator().next().getFirstName());
    }
        return greetings;
    }
}
