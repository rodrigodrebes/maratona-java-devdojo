package org.maratonajava.JUnit.service;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.maratonajava.JUnit.dominio.Person;

import java.util.List;

public class PersonServiceTest {
    private Person adult;
    private Person notAdult;
    private PersonService ps;

    @BeforeEach
    public void setUp(){
        adult = new Person(18);
        notAdult = new Person (15);
        ps = new PersonService();
    }

    @Test
    public void testIsAdult_ReturnFalse_WhenAgeIsLowerThan18() {
//        Person pessoa = new Person(15);
//        PersonService ps = new PersonService();

        // assertivas, TEM QUE SER ASSIM
        Assertions.assertEquals(false, ps.isAdult(notAdult));
    }
@Test
    public void testIsAdult_ReturnTrue_WhenAgeIsGreaterOrEqualThan18() {
//        Person pessoa = new Person(18);
//        PersonService ps = new PersonService();

        // assertivas: precisa retornar true
        Assertions.assertEquals(true, ps.isAdult(adult));
    }

    @Test
    public void testIsAdult_ShouldThrowException_WhenPersonIsNull() {

        Assertions.assertThrows(NullPointerException.class, () -> {
            ps.isAdult(null);},
                "Pessoa não pode ser nulo!");

    }


    @Test
    @DisplayName("Deve retornar a lista só de Adultos")
    public void testIsAdult_ReturnListWithAdultOnly_WhenListOfPersonWithAdultIsPassed() {
    Person pessoa = new Person(18);
    Person pessoa2 = new Person(17);
    Person pessoa3 = new Person(6);
    Person pessoa4 = new Person (23);

    List<Person> personList = List.of(pessoa, pessoa2,pessoa3,pessoa4);


        Assertions.assertEquals(2, ps.filterRemovingNotAdult(personList).size());

    }





}