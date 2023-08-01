package org.maratonajava.JUnit.service;

import org.maratonajava.JUnit.dominio.Person;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class PersonService {
    public boolean isAdult(Person pessoa){

        Objects.requireNonNull(pessoa, "Pessoa não pode ser nulo");
        return pessoa.getAge()>=18;
    }

    public List<Person> filterRemovingNotAdult(List<Person> personList){
        return personList.stream().filter(this::isAdult).collect(Collectors.toList());
    }
}
