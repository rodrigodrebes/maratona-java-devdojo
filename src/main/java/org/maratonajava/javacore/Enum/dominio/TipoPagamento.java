package org.maratonajava.javacore.Enum.dominio;

public enum TipoPagamento {
        DEBITO{
            @Override
            public double calcularDesconto(double valor) {
                return valor*0.1;
            }
        }, CREDITO{
        @Override
        public double calcularDesconto(double valor) {
            return valor *0.05;
        }
    };

        // define-se o método abstrato e subscreve-se acima nas enumerações
    public abstract double calcularDesconto(double valor);

}