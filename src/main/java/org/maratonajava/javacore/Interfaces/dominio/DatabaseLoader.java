package org.maratonajava.javacore.Interfaces.dominio;

public class DatabaseLoader implements DataLoader, DataRemover {

    @Override
    public void load(){
        System.out.println("Carregando dados no BD");

    }

      @Override
      public void remove(){
          System.out.println("Removendo dados do BD");
      }

      @Override
      public void checkPermission(){
          System.out.println("Checando permissões no BD");
    }
}
