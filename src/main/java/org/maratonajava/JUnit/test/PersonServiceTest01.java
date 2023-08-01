package org.maratonajava.JUnit.test;

import org.maratonajava.JUnit.dominio.Person;
import org.maratonajava.JUnit.service.PersonService;

public class PersonServiceTest01 {
    public static void main(String[] args){
        Person pessoa = new Person(15);
        PersonService personService = new PersonService();
        System.out.println("É adulta? true/false: " + personService.isAdult(pessoa));

    }
}
