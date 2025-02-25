package DAO;

import annotation.Tabela;

public class JpaDao {

    public void pesquisar(Object obj) {
        //Recuperar a anotação @Tabela
        Tabela anotacao = obj.getClass().getAnnotation(Tabela.class);
        System.out.println("SELECT * FROM " + anotacao.nome());
    }

}