package org.maratonajava.javacore.collections.list.test;

import org.maratonajava.javacore.collections.list.dominio.Smarthphone;

import java.util.ArrayList;
import java.util.List;

public class SmartPhoneListTest02 {
    public static void main(String[] args) {

        // lista de Objetos

        Smarthphone s1 = new Smarthphone("1ABCCC", "Motorola");
        Smarthphone s2 = new Smarthphone("ZZFF", "Iphone");
        Smarthphone s3 = new Smarthphone("OKKE", "Samsumg");


        List<Smarthphone> smarthphones = new ArrayList<>(6);
        smarthphones.add(s1);
        smarthphones.add(s2);
        smarthphones.add(s3);

        for (Smarthphone smartphone : smarthphones){
            System.out.println(smartphone);
        }

        // checa se já existe na lista
        System.out.println(smarthphones.contains(s3));

        // retorna a posição de índice do objeto específico
        int indexSmartPhone = smarthphones.indexOf(s3);
        System.out.println(indexSmartPhone);

    }
}
