package org.maratonajava.javacore.Interfaces.dominio;

// por padrão, todos métodos são public e abstract
// classes que implementam DEVEM implementar todos métodos
// oferece implementação múltipla
public interface DataLoader {

    void load();

    // métodos concretos
    default void checkPermission(){
        System.out.println("Fazendo checagem de permissões");
    }
}
