package org.maratonajava.JUnit.service;

import junit.framework.TestCase;
import org.junit.Assert;
import org.maratonajava.JUnit.dominio.Person;

public class PersonServiceTest extends TestCase {

    public void testIsAdult_ReturnFalse_WhenAgeIsLowerThan18() {
        Person pessoa = new Person(15);
        PersonService ps = new PersonService();

        // assertivas, TEM QUE SER ASSIM
        Assert.assertEquals(false, ps.isAdult(pessoa));
    }
}