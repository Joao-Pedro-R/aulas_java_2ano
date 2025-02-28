package view;

import DAO.JpaDao;
import model.Aluno;
import model.Pessoa;

public class Exercicio {

    public static void main(String[] args) {
        //Instanciar um aluno
        Aluno aluno = new Aluno();
        //Instanciar um JpaDao
         JpaDao dao = new JpaDao();
        //Chamar o metodo pesquisar passando o aluno
        dao.pesquisar(aluno);

        Pessoa pessoa = new Pessoa();
        dao.pesquisar(pessoa);

    }
}