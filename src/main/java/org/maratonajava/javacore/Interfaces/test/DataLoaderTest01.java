package org.maratonajava.javacore.Interfaces.test;

import org.maratonajava.javacore.Interfaces.dominio.DatabaseLoader;
import org.maratonajava.javacore.Interfaces.dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader dbloader = new DatabaseLoader();
        FileLoader fileloader = new FileLoader();

        dbloader.load();
        fileloader.load();
        dbloader.remove();

        // ocorrendo no nível da interface
        dbloader.checkPermission();
        fileloader.checkPermission();
    }
}
