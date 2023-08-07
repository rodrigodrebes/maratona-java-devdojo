package org.maratonajava.javacore.streams.test;


import org.maratonajava.javacore.streams.dominio.Novel;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest04 {

    public static void main(String[] args) {

        // stream de strings usando Stream.of
        Stream.of("Eleve", "O", "Cosmo", "no seu coração")
                .map(String::toUpperCase)
                .forEach(s -> System.out.print(s + " "));

        // stream de int
        int num[] = {1,2,3,4,5};
        Arrays.stream(num)
                .average()
                .ifPresent(System.out::println);

        // stream de int
        IntStream.rangeClosed(1,50)
                .filter(n -> n%2 ==0)
                .forEach(n -> System.out.println(n + " "));


        // stream de int usando Generics
        List<Integer> lista = Arrays.asList(3,4,5,10,20);

        Stream<Integer> st1 = lista.stream()
                .map(x -> x*10);

        System.out.println(Arrays.toString(st1.toArray()));


        // stream de int
        Stream<String> st2 = Stream.of("Maria", "Alex", "Rodrigo");

        // stream de int usando iterate
        Stream<Integer> st3 = Stream.iterate(0,x->x+2);
        System.out.println(Arrays.toString(st3.limit(10).toArray()));



    }


    }

