package org.maratonajava.javacore.Enum.test;

import org.maratonajava.javacore.Enum.dominio.Cliente;
import org.maratonajava.javacore.Enum.dominio.TipoCliente;
import org.maratonajava.javacore.Enum.dominio.TipoPagamento;

public class ClienteTest01 {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Henrique", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);

        Cliente empresa = new Cliente("JBS", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);

        System.out.println(cliente1);
        System.out.println(empresa);

        System.out.println(TipoPagamento.DEBITO.calcularDesconto(200));
    }
}
