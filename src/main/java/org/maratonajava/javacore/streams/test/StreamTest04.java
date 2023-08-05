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

        // stream de strings
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
    }


    }

