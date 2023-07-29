package org.maratonajava.javacore.associacao.test;

import org.maratonajava.javacore.associacao.dominio.Escola;
import org.maratonajava.javacore.associacao.dominio.Professor;

public class EscolaTest01 {

    public static void main(String[] args) {

        Escola escola = new Escola("Alberto Coelho");
        Professor professor = new Professor("Paulo");
        Professor professor2 = new Professor ("Augusto");

        Professor[] professores = {professor, professor2};

        escola.setProfessores(professores);

        escola.imprime();
    }
}
