package org.maratonajava.JUnit.service;

import org.maratonajava.JUnit.dominio.Person;

import java.util.Objects;

public class PersonService {
    public boolean isAdult(Person pessoa){

        Objects.requireNonNull(pessoa, "Pessoa não pode ser nulo");
        return pessoa.getAge()>=18;
    }
}
