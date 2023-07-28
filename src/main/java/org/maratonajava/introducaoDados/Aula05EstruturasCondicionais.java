package org.maratonajava.introducaoDados;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {

        int idade = 16;

        if(idade > 18){
            System.out.println("Pode comprar bebida alcoólica");
        }
        else if(idade == 16){
        System.out.println("Não pode comprar bebida alcoólica, mas pode beber");
             }
        else{
            System.out.println("Não pode comprar nem beber");
        }


}
}
