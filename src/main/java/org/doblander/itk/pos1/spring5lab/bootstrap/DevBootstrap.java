package org.doblander.itk.pos1.spring5lab.bootstrap;

import org.doblander.itk.pos1.spring5lab.entities.Person;
import org.doblander.itk.pos1.spring5lab.repositories.PersonRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private PersonRepository personRepository;

    public DevBootstrap(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public void initData() {

        // Hans
        Person hans = new Person("Hans", "Hanser");
        personRepository.save(hans);

        // Johnny
        Person johnny = new Person("Johnny", "Walker");
        personRepository.save(johnny);
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }
}
