package org.maratonajava.introducaoDados;

public class Aula06EstruturasDeRepeticao {
    public static void main(String[] args) {
        int count = 0;

        // while
        while (count <10){
            System.out.println(count);
            count++;
        }

        // do-while
        count = 0;
        do{
            System.out.println("dentro-do-while");
            count++;
        }while(count<10);


        // for

        for(int i=0;i<10;i++){
            System.out.println("For " +i);
        }
    }
}
