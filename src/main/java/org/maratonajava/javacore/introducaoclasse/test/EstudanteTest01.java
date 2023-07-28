package org.maratonajava.javacore.introducaoclasse.test;

import org.maratonajava.javacore.introducaoclasse.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante pessoa = new Estudante("Rodrigo", 27, 'M');
        System.out.println(pessoa.nome);
    }
}
